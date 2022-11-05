package br.com.gsl.controleDeAcesso.controller;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gsl.controleDeAcesso.POJO.UserPOJO;
import br.com.gsl.controleDeAcesso.entity.Permission;
import br.com.gsl.controleDeAcesso.entity.User;
import br.com.gsl.controleDeAcesso.jwt.JwtTokenProvider;
import br.com.gsl.controleDeAcesso.repository.UserRepository;

@CrossOrigin
@RestController
@RequestMapping("/login")
public class AuthController {

	private final AuthenticationManager authenticationManager;
	private final JwtTokenProvider jwtTokenProvider;
	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;

	@Autowired
	public AuthController(PasswordEncoder passwordEncoder, AuthenticationManager authenticationManager,
			JwtTokenProvider jwtTokenProvider, UserRepository userRepository) {
		this.authenticationManager = authenticationManager;
		this.jwtTokenProvider = jwtTokenProvider;
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
	}

	@GetMapping("/{id}")
	public ResponseEntity<Optional<User>> userById(@PathVariable Long id) {
		return ResponseEntity.ok().body(userRepository.findById(id));
	}

	// Registrar usuario
	@CrossOrigin
	@PostMapping("/registration")
	public ResponseEntity<User> register(@RequestBody User user) {
		if (userRepository.findByUserName(user.getUsername()) != null) {
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
		Permission permission = new Permission();
		permission.setId(3);

		// default role.
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		user.setAccountNonExpired(true);
		user.setAccountNonLocked(true);
		user.setCredentialsNonExpired(true);
		user.setEnabled(true);
		user.setPermissions(Arrays.asList(permission));
		userRepository.save(user);
		return new ResponseEntity<>(user, HttpStatus.CREATED);
	}

	@CrossOrigin
	@PostMapping(produces = { "application/json", "application/xml", "application/x-yaml" }, consumes = {
			"application/json", "application/xml", "application/x-yaml" })
	public ResponseEntity<?> login(@RequestBody UserPOJO userPOJO) {
		try {
			var userName = userPOJO.getUserName();
			var password = userPOJO.getPassword();

			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userName, password));

			User user = userRepository.findByUserName(userName);

			var token = "";

			if (user != null) {
				token = jwtTokenProvider.createToken(userName, user.getRoles());
			} else {
				throw new UsernameNotFoundException("User name not found");
			}

			UserPOJO userToken = new UserPOJO(userName, token, user.getPermissions());
			return ResponseEntity.ok().body(userToken);
//			Map<Object, Object> model = new HashMap<>();
//					model.put("username", userName);
//					model.put("token", token);
//					return ok(model);

		} catch (AuthenticationException e) {
			throw new BadCredentialsException("Invalido nome / password");

		}
	}

}

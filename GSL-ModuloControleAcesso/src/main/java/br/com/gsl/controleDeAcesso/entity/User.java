package br.com.gsl.controleDeAcesso.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "user")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class User implements UserDetails, Serializable {

	private static final long serialVersionUID = -8019823969852812389L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "user_name", unique = true)
	private String userName;
	
	@Column(name = "sobreNome")
	private String sobreNome;
	
	@Column(name = "email", unique = true)
	private String email;

	@Column(name = "password")
	private String password;
	
	@Column(name="cpfOucnpj", unique = true)
	private String cpfoucnpj;
	
	@Column(name = "celular")
	private String celular;
	
	@OneToMany(targetEntity = Endereco.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_fk", referencedColumnName = "id")
	private List <Endereco> endereco;

	@Column(name = "accountNonExpired")
	private Boolean accountNonExpired;

	@Column(name = "accountNonLocked")
	private Boolean accountNonLocked;

	@Column(name = "credentialsNonExpired")
	private Boolean credentialsNonExpired;

	@Column(name = "enabled")
	private Boolean enabled;

   // @Transient
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinTable(name = "user_permission", joinColumns = { @JoinColumn(name = "id_user") }, inverseJoinColumns = {
			@JoinColumn(name = "id_permissions") })
	private List<Permission> permissions;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.permissions;
	}

	public List<String> getRoles() {
		List<String> roles = new ArrayList<>();
		this.permissions.stream().forEach(p -> {
			roles.add(p.getDescription());
		});
		return roles;
	}

	@Override
	public String getUsername() {
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}

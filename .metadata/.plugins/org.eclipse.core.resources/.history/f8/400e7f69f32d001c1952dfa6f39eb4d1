package br.com.gsl.controleDeAcesso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gsl.controleDeAcesso.entity.Menu;
import br.com.gsl.controleDeAcesso.service.MenuService;

@CrossOrigin
@RestController
@RequestMapping(value = "/menu")
public class MenuController {
	
	@Autowired
	public MenuService menuService;
	
	@CrossOrigin
	@GetMapping(value = "/listaMenu/{permissions}")
	ResponseEntity<List<Menu>> MenuPermissions(@PathVariable Integer permissions){
		List <Menu> menus = menuService.menuPermissions(permissions);
		return ResponseEntity.ok().body(menus);
	}
	
	

}

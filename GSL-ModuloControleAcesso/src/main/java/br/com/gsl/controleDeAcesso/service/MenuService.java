package br.com.gsl.controleDeAcesso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gsl.controleDeAcesso.entity.Menu;
import br.com.gsl.controleDeAcesso.repository.MenuRepository;

@Service
public class MenuService {
	
	@Autowired
	private MenuRepository menuRepository;
	
	
	public List<Menu> menuPermissions(Integer permission) {
		return menuRepository.findByMenuPermission(permission);
	}


	

}

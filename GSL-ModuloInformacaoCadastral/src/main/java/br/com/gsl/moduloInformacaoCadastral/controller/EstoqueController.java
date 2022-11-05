package br.com.gsl.moduloInformacaoCadastral.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gsl.moduloInformacaoCadastral.entity.EstoqueEntity;
import br.com.gsl.moduloInformacaoCadastral.service.EstoqueService;

@RestController
@RequestMapping(value = "v1/estoque")
public class EstoqueController {
	
	@Autowired
	private EstoqueService estoqueService;
	
	@GetMapping(value = "/findAll")
	public List<EstoqueEntity>findAll(){ 
		return estoqueService.findAll();
	}

}

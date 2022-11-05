package br.com.gsl.moduloInformacaoCadastral.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gsl.moduloInformacaoCadastral.entity.ProdutosEntity;
import br.com.gsl.moduloInformacaoCadastral.service.ProdutoService;

@RestController
@RequestMapping(value = "v1/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService;
	
	
	@GetMapping(value = "/findAll")
	public List<ProdutosEntity> findAll(){
		return produtoService.findAll();
	}

}

package br.com.gsl.moduloInformacaoCadastral.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gsl.moduloInformacaoCadastral.entity.ProdutosEntity;
import br.com.gsl.moduloInformacaoCadastral.repository.ProdutosRepository;

@Service
public class ProdutoService {
	
	
	@Autowired
	private ProdutosRepository produtoRepository;
	
	
	public List<ProdutosEntity> findAll(){
		return produtoRepository.findAll();
	}

}

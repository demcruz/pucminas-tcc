package br.com.gsl.moduloInformacaoCadastral.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gsl.moduloInformacaoCadastral.entity.EstoqueEntity;
import br.com.gsl.moduloInformacaoCadastral.repository.EstoqueRepository;

@Service
public class EstoqueService {
	
	@Autowired
	private EstoqueRepository estoqueRepository;
	
	
	public List<EstoqueEntity> findAll() {
		return estoqueRepository.findAll();
		
	}
}

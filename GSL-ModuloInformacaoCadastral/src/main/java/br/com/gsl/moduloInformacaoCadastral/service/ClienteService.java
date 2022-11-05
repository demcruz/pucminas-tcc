package br.com.gsl.moduloInformacaoCadastral.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gsl.moduloInformacaoCadastral.entity.ClientesEntity;
import br.com.gsl.moduloInformacaoCadastral.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	
	public List<ClientesEntity> findAll(){
		return clienteRepository.findAll();
	}
	
}

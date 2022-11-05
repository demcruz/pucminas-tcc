package br.com.gsl.moduloInformacaoCadastral.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gsl.moduloInformacaoCadastral.entity.ClientesEntity;
import br.com.gsl.moduloInformacaoCadastral.service.ClienteService;

@RestController
@RequestMapping(value = "v1/clientes")
public class ClientesController {
	
	@Autowired
	private ClienteService clienteService;
	
	
	@GetMapping(value = "/todosClientes")
	public List<ClientesEntity> findAll(){
		return clienteService.findAll();
	}

}

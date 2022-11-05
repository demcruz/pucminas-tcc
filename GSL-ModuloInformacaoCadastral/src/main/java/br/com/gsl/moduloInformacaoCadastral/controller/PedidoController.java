package br.com.gsl.moduloInformacaoCadastral.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gsl.moduloInformacaoCadastral.entity.PedidoEntity;
import br.com.gsl.moduloInformacaoCadastral.service.PedidoService;

@RestController
@RequestMapping(value = "/v1/pedidos")
public class PedidoController {
	
	@Autowired
	private PedidoService pedidoService;
	
	@GetMapping(value = "/findall")
	public List<PedidoEntity>findAll(){
		return pedidoService.findAll();
	}

}

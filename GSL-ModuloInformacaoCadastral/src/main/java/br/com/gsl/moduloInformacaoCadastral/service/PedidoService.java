package br.com.gsl.moduloInformacaoCadastral.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gsl.moduloInformacaoCadastral.entity.PedidoEntity;
import br.com.gsl.moduloInformacaoCadastral.repository.PedidoRepository;

@Service
public class PedidoService {
	
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	
	public List<PedidoEntity> findAll(){
		return pedidoRepository.findAll();
	}

}

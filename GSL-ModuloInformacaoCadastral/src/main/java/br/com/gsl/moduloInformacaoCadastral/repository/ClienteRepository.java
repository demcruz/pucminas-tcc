package br.com.gsl.moduloInformacaoCadastral.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gsl.moduloInformacaoCadastral.entity.ClientesEntity;

@Repository
public interface ClienteRepository extends JpaRepository<ClientesEntity, Integer> {

}

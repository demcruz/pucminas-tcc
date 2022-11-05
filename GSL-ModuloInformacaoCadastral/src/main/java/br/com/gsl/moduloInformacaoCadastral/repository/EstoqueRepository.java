package br.com.gsl.moduloInformacaoCadastral.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gsl.moduloInformacaoCadastral.entity.EstoqueEntity;

@Repository
public interface EstoqueRepository extends JpaRepository<EstoqueEntity, Integer> {

}

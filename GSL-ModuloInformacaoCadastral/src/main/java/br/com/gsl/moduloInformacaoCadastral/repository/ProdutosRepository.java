package br.com.gsl.moduloInformacaoCadastral.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gsl.moduloInformacaoCadastral.entity.ProdutosEntity;

@Repository
public interface ProdutosRepository extends JpaRepository<ProdutosEntity, Integer> {

}

package br.com.gsl.moduloInformacaoCadastral.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "produtos")
public class ProdutosEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idprodutos;

	private String nomeproduto;

	private String descricaoproduto;

	@JsonIgnore
	@OneToMany(mappedBy = "idprodutos")
	private Set<EstoqueEntity> estoque = new HashSet<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "idprodutos")
	private Set<PedidoEntity> pedido = new HashSet<>();

	public ProdutosEntity() {
	}

	public ProdutosEntity(Integer idprodutos, String nomeproduto, String descricaoproduto, Set<EstoqueEntity> estoque) {
		this.idprodutos = idprodutos;
		this.nomeproduto = nomeproduto;
		this.descricaoproduto = descricaoproduto;
		this.estoque = estoque;
	}

	public Integer getIdprodutos() {
		return idprodutos;
	}

	public void setIdprodutos(Integer idprodutos) {
		this.idprodutos = idprodutos;
	}

	public String getNomeproduto() {
		return nomeproduto;
	}

	public void setNomeproduto(String nomeproduto) {
		this.nomeproduto = nomeproduto;
	}

	public String getDescricaoproduto() {
		return descricaoproduto;
	}

	public void setDescricaoproduto(String descricaoproduto) {
		this.descricaoproduto = descricaoproduto;
	}

	public Set<EstoqueEntity> getEstoque() {
		return estoque;
	}

	public void setEstoque(Set<EstoqueEntity> estoque) {
		this.estoque = estoque;
	}

}

package br.com.gsl.moduloInformacaoCadastral.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "estoque")
public class EstoqueEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idestoque;
	
	@ManyToOne
	@JoinColumn(name = "idprodutos")
	private ProdutosEntity idprodutos;
	
	@ManyToOne
	@JoinColumn(name = "idclientes")
	private ClientesEntity idclientes;
	
	private Double precosprodutos;
	
	private Integer quantidade;	
	
	

	public EstoqueEntity() {
	}

	

	public EstoqueEntity(Integer idestoque, ProdutosEntity idprodutos, ClientesEntity idclientes, Double precosprodutos,
			Integer quantidade) {
		this.idestoque = idestoque;
		this.idprodutos = idprodutos;
		this.idclientes = idclientes;
		this.precosprodutos = precosprodutos;
		this.quantidade = quantidade;
	}



	public Integer getIdestoque() {
		return idestoque;
	}

	public void setIdestoque(Integer idestoque) {
		this.idestoque = idestoque;
	}

	public ProdutosEntity getIdprodutos() {
		return idprodutos;
	}

	public void setIdprodutos(ProdutosEntity idprodutos) {
		this.idprodutos = idprodutos;
	}

	public ClientesEntity getIdclientes() {
		return idclientes;
	}

	public void setIdclientes(ClientesEntity idclientes) {
		this.idclientes = idclientes;
	}

	public Double getPrecosprodutos() {
		return precosprodutos;
	}

	public void setPrecosprodutos(Double precosprodutos) {
		this.precosprodutos = precosprodutos;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	

}

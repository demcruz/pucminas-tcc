package br.com.gsl.moduloInformacaoCadastral.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos")
public class PedidoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idpedidos;
	
	@ManyToOne
	@JoinColumn(name = "idclientes")
	private ClientesEntity idclientes;
	
	@ManyToOne
	@JoinColumn(name = "idprodutos")
	private ProdutosEntity idprodutos;
	
	private Date datapedido;
	
	private String nomepessoa;
	
	private String enderecodeentrega;
	
	private String complemento;
	
	private String cpfpessoa;
	
	private Integer cep;
	
	private String estado;
	
	private String municipio;		
	

	public PedidoEntity() {
	}
	

	public PedidoEntity(Integer idpedidos, ClientesEntity idclientes, ProdutosEntity idprodutos, Date datapedido,
			String nomepessoa, String enderecodeentrega, String complemento, String cpfpessoa, Integer cep,
			String estado, String municipio) {
		this.idpedidos = idpedidos;
		this.idclientes = idclientes;
		this.idprodutos = idprodutos;
		this.datapedido = datapedido;
		this.nomepessoa = nomepessoa;
		this.enderecodeentrega = enderecodeentrega;
		this.complemento = complemento;
		this.cpfpessoa = cpfpessoa;
		this.cep = cep;
		this.estado = estado;
		this.municipio = municipio;
	}



	public Integer getIdpedidos() {
		return idpedidos;
	}

	public void setIdpedidos(Integer idpedidos) {
		this.idpedidos = idpedidos;
	}

	

	public ClientesEntity getIdclientes() {
		return idclientes;
	}

	public void setIdclientes(ClientesEntity idclientes) {
		this.idclientes = idclientes;
	}

	public ProdutosEntity getIdprodutos() {
		return idprodutos;
	}

	public void setIdprodutos(ProdutosEntity idprodutos) {
		this.idprodutos = idprodutos;
	}

	public Date getDatapedido() {
		return datapedido;
	}

	public void setDatapedido(Date datapedido) {
		this.datapedido = datapedido;
	}

	public String getNomepessoa() {
		return nomepessoa;
	}

	public void setNomepessoa(String nomepessoa) {
		this.nomepessoa = nomepessoa;
	}

	public String getEnderecodeentrega() {
		return enderecodeentrega;
	}

	public void setEnderecodeentrega(String enderecodeentrega) {
		this.enderecodeentrega = enderecodeentrega;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCpfpessoa() {
		return cpfpessoa;
	}

	public void setCpfpessoa(String cpfpessoa) {
		this.cpfpessoa = cpfpessoa;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	
	
	
	
	
	

}

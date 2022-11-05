package br.com.gsl.moduloInformacaoCadastral.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "clientes")
public class ClientesEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2505608841669217913L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idclientes")
	private Integer idClientes;
	
	@Column(name = "nomeempresa")
	private String nomeEmpresa;
	
	@Column(name = "cnpjempresa")
	private String cnpjEmpresa;
	
	@Column(name = "estadoempresa")
	private String estadoEmpresa;
	
	@Column(name = "municipioempresa")
	private String municipioEmpresa;
	
	@JsonIgnore
	@OneToMany(mappedBy = "idclientes")
	private Set<EstoqueEntity> estoque = new HashSet<>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "idclientes")
	private Set<PedidoEntity> pedido = new HashSet<>();
	

	public ClientesEntity() {
	}

	public ClientesEntity(Integer idClientes, String nomeEmpresa, String cnpjEmpresa, String estadoEmpresa,
			String municipioEmpresa) {
		this.idClientes = idClientes;
		this.nomeEmpresa = nomeEmpresa;
		this.cnpjEmpresa = cnpjEmpresa;
		this.estadoEmpresa = estadoEmpresa;
		this.municipioEmpresa = municipioEmpresa;
	}

	public Integer getIdClientes() {
		return idClientes;
	}

	public void setIdClientes(Integer idClientes) {
		this.idClientes = idClientes;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getCnpjEmpresa() {
		return cnpjEmpresa;
	}

	public void setCnpjEmpresa(String cnpjEmpresa) {
		this.cnpjEmpresa = cnpjEmpresa;
	}

	public String getEstadoEmpresa() {
		return estadoEmpresa;
	}

	public void setEstadoEmpresa(String estadoEmpresa) {
		this.estadoEmpresa = estadoEmpresa;
	}

	public String getMunicipioEmpresa() {
		return municipioEmpresa;
	}

	public void setMunicipioEmpresa(String municipioEmpresa) {
		this.municipioEmpresa = municipioEmpresa;
	}
	
	
	
	

}

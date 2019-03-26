package br.edu.unifacear.agile.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tab_projetos_cadastrados")
public class projetos_cadastrados {

	public static projetos_cadastrados projetos;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	//@Column(nullable=false)
	private String cod_projeto;
	private String nomeprojeto;
	private String dev1;
	private String dev2;
	private String dev3;
	private String estimativa;
	private String descricao;
	@ManyToOne
	@JoinColumn(name="CLIENTE_ID")
	private String cliente;
	
	
	
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getDev1() {
		return dev1;
	}
	public void setDev1(String dev1) {
		this.dev1 = dev1;
	}
	public String getDev2() {
		return dev2;
	}
	public void setDev2(String dev2) {
		this.dev2 = dev2;
	}
	public String getDev3() {
		return dev3;
	}
	public void setDev3(String dev3) {
		this.dev3 = dev3;
	}
	public String getCod_projeto() {
		return cod_projeto;
	}
	public void setCod_projeto(String cod_projeto) {
		this.cod_projeto = cod_projeto;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomeprojeto() {
		return nomeprojeto;
	}
	public void setNomeprojeto(String nomeprojeto) {
		this.nomeprojeto = nomeprojeto;
	}
	
	public String getEstimativa() {
		return estimativa;
	}
	public void setEstimativa(String estimativa) {
		this.estimativa = estimativa;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}

package br.edu.unifacear.agile.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "TAB_CLIENTE")
public class cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nome;
	
	@OneToMany(mappedBy="cliente")
	private List<projetos_cadastrados> projetos_cadastrados;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj_cpf() {
		return cnpj_cpf;
	}
	public void setCnpj_cpf(String cnpj_cpf) {
		this.cnpj_cpf = cnpj_cpf;
	}
	private String cnpj_cpf;
}

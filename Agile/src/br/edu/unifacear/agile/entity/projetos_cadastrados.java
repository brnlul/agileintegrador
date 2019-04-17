package br.edu.unifacear.agile.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

import com.sun.istack.internal.NotNull;

@Entity
@Table(name = "tab_projetos")
public class projetos_cadastrados {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String cod_projeto;
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@ManyToOne
	@JoinColumn(name = "EQUIPE_ID")
	private cliente equipe;

	public cliente getCliente() {
		return equipe;
	}

	public void setCliente(cliente cliente) {
		this.equipe = cliente;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCod_projeto() {
		return cod_projeto;
	}

	public void setCod_projeto(String cod_projeto) {
		this.cod_projeto = cod_projeto;
	}

}

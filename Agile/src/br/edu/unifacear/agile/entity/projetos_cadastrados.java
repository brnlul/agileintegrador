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
@Table(name="tab_projetos")
public class projetos_cadastrados {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String cod_projeto;
	
	@ManyToOne
	@JoinColumn(name="CLIENTE_ID")
	private cliente cliente;
	
	public cliente getCliente() {
		return cliente;
	}

	public void setCliente(cliente cliente) {
		this.cliente = cliente;
	}

	@ManyToMany
	private List<projetos_cadastrados> projetos;

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

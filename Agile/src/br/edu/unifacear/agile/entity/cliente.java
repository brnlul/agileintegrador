package br.edu.unifacear.agile.entity;

import java.util.List;

import javax.persistence.CascadeType;
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
	private String nomeEquipe;
	private String Integrante1;
	private String Integrante2;
	
	@OneToMany(mappedBy="equipe")
	private List<projetos_cadastrados> projetos;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeEquipe() {
		return nomeEquipe;
	}

	public void setNomeEquipe(String nomeEquipe) {
		this.nomeEquipe = nomeEquipe;
	}

	public String getIntegrante1() {
		return Integrante1;
	}

	public void setIntegrante1(String integrante1) {
		Integrante1 = integrante1;
	}

	public String getIntegrante2() {
		return Integrante2;
	}

	public void setIntegrante2(String integrante2) {
		Integrante2 = integrante2;
	}
	
	
}
	
	
	
	
	
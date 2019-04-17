package br.edu.unifacear.agile.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import br.edu.unifacear.agile.dao.Dao;
import br.edu.unifacear.agile.dao.GenericDao;

import br.edu.unifacear.agile.entity.cliente;
import br.edu.unifacear.agile.entity.projetos_cadastrados;

public class cadastroteste {

	@Test
	public void deveriacadastroteste() {

		cliente c = new cliente();
		c.setNomeEquipe("Alfa");
		c.setIntegrante1("Edson");
		c.setIntegrante2("Jose");

		Dao<cliente> DaoEquipe = new GenericDao<cliente>();
		DaoEquipe.inserir(c);

		projetos_cadastrados projetos = new projetos_cadastrados();
		projetos.setCliente(c);
		projetos.setCod_projeto("3052");

		Dao<projetos_cadastrados> daoProjeto = new GenericDao<projetos_cadastrados>();
		daoProjeto.inserir(projetos);

	}
}

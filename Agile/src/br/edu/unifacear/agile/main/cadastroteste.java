package br.edu.unifacear.agile.main;

import org.junit.Test;

import br.edu.unifacear.agile.dao.Dao;
import br.edu.unifacear.agile.dao.GenericDao;
import br.edu.unifacear.agile.entity.cliente;
import br.edu.unifacear.agile.entity.projetos_cadastrados;

public class cadastroteste {

	@Test
	public void cadastroteste() {
		
		cliente c = new cliente();
		c.setNome("Edson");
		c.setCnpj_cpf("09245791963");
		Dao<cliente> clienteDao = new GenericDao<cliente>();		
		clienteDao.inserir(c);
		
		
		Dao<projetos_cadastrados> projetoDAO = new GenericDao<projetos_cadastrados>();
		projetos_cadastrados pc = new projetos_cadastrados();
		projetoDAO.inserir(pc);
		
	}
}

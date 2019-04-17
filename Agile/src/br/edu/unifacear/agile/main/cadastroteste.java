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
		System.out.println("Digite algo");
		
		cliente c = new cliente();
		c.setNome("Edson");
		Dao<cliente> DaoCliente = new GenericDao<cliente>();		
		DaoCliente.inserir(c);
		
		projetos_cadastrados projetos = new projetos_cadastrados();
		projetos.setCliente(c);
		projetos.setCod_projeto("3052");
		
		Dao<projetos_cadastrados> daoAluguel = new GenericDao<projetos_cadastrados>();
		daoAluguel.inserir(projetos);
		

	}
}

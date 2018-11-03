package br.com.financeiro.dao;

import org.junit.Ignore;
import org.junit.Test;

import br.com.financeiro.domain.Person;
import br.com.financeiro.domain.User;

public class UserDAOTest {

	@Test
	@Ignore
	public void save(){
		PersonDAO personDAO = new PersonDAO();
		Person person = personDAO.find(1L);
		
		System.out.println("Person Encontrada");
		System.out.println("Nome: " + person.getName());
		System.out.println("CPF: " + person.getCpf());
		
		User user = new User();
		user.setActive(true);
		user.setPerson(person);
		user.setPassword("q1w2e3r4");
		user.setType('A');
		
		UserDAO userDAO = new UserDAO();
		userDAO.save(user);
		
		System.out.println("Usuário salvo com sucesso.");
	}
	

}

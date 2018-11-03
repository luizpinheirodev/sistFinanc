package br.com.financeiro.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Ignore;
import org.junit.Test;

import br.com.financeiro.domain.Client;
import br.com.financeiro.domain.Person;

public class ClientDAOTest {

	@Test
	@Ignore
	public void salvar() throws ParseException {
		PersonDAO personDAO = new PersonDAO();
		Person person = personDAO.find(2L);

		Client client = new Client();
		client.setDateRegister(new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2015"));
		client.setActive(false);
		client.setPerson(person);

		ClientDAO clientDAO = new ClientDAO();
		clientDAO.save(client);

		System.out.println("Client salvo com sucesso.");
	}	
	

}

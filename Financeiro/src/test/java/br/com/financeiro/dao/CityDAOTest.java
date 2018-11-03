package br.com.financeiro.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.financeiro.domain.City;
import br.com.financeiro.domain.State;

public class CityDAOTest {

	@Test
	@Ignore
	public void salvar() {
		Long codigoState = 5L;
		
		StateDAO StateDAO = new StateDAO();

		State State = StateDAO.find(codigoState);

		City City = new City();
		City.setName("Belo Horizonte");
		City.setState(State);

		CityDAO CityDAO = new CityDAO();
		CityDAO.save(City);
	}

	@Test
	@Ignore
	public void listar() {
		CityDAO CityDAO = new CityDAO();
		List<City> resultado = CityDAO.list();

		for (City City : resultado) {
			System.out.println("Código da City: " + City.getCodigo());
			System.out.println("Name da City: " + City.getName());
			System.out.println("Código do State: " + City.getState().getCodigo());
			System.out.println("Initials do State: " + City.getState().getInitials());
			System.out.println("Name do State: " + City.getState().getName());
			System.out.println();
		}
	}
	
	@Test
	@Ignore
	public void find(){
		Long codigo = 7L;
		
		CityDAO CityDAO = new CityDAO();
		City City = CityDAO.find(codigo);
		
		System.out.println("Código da City: " + City.getCodigo());
		System.out.println("Name da City: " + City.getName());
		System.out.println("Código do State: " + City.getState().getCodigo());
		System.out.println("Initials do State: " + City.getState().getInitials());
		System.out.println("Name do State: " + City.getState().getName());
	}
	
	@Test
	@Ignore
	public void excluir(){
		Long codigo = 7L;
		
		CityDAO CityDAO = new CityDAO();
		City City = CityDAO.find(codigo);
		
		CityDAO.delete(City);
		
		System.out.println("City Removida");
		System.out.println("Código da City: " + City.getCodigo());
		System.out.println("Name da City: " + City.getName());
		System.out.println("Código do State: " + City.getState().getCodigo());
		System.out.println("Initials do State: " + City.getState().getInitials());
		System.out.println("Name do State: " + City.getState().getName());
	}
	
	@Test
	@Ignore
	public void update(){
		Long codigoCity = 6L;
		Long codigoState = 11L;
		
		StateDAO StateDAO = new StateDAO();
		State State = StateDAO.find(codigoState);
		
		System.out.println("Código do Estado: " + State.getCodigo());
		System.out.println("Sigla do Estado: " + State.getInitials());
		System.out.println("Nome do Estado: " + State.getName());
		
		CityDAO CityDAO = new CityDAO();
		City City = CityDAO.find(codigoCity);
		
		System.out.println("City A Ser Editada");
		System.out.println("Código da City: " + City.getCodigo());
		System.out.println("Name da City: " + City.getName());
		System.out.println("Código do State: " + City.getState().getCodigo());
		System.out.println("Initials do State: " + City.getState().getInitials());
		System.out.println("Name do State: " + City.getState().getName());
		
		City.setName("Guarapuava");
		City.setState(State);
		
		CityDAO.update(City);
		
		System.out.println("City Editada");
		System.out.println("Código da City: " + City.getCodigo());
		System.out.println("Name da City: " + City.getName());
		System.out.println("Código do State: " + City.getState().getCodigo());
		System.out.println("Initials do State: " + City.getState().getInitials());
		System.out.println("Name do State: " + City.getState().getName());
	}

}

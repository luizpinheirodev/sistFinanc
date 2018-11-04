package br.com.financeiro.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import org.omnifaces.util.Messages;

import br.com.financeiro.dao.StateDAO;
import br.com.financeiro.domain.State;

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class StateBean implements Serializable {

	private State state;
	private List<State> states;

	public List<State> getStates() {
		return states;
	}

	public void setStates(List<State> states) {
		this.states = states;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void newState() {
		state = new State();
	}

	public void save() {
		try {
			StateDAO stateDAO = new StateDAO();
			stateDAO.merge(state);

			newState();
			states = stateDAO.list();

			Messages.addGlobalInfo("Estado salvo com sucesso.");
		} catch (RuntimeException e) {
			Messages.addGlobalError("Ocorreu um erro ao tentar salvar o estado.");
			e.printStackTrace();
		}
	}

	@PostConstruct
	public void list() {
		try {
			StateDAO stateDAO = new StateDAO();
			states = stateDAO.list();
		} catch (RuntimeException e) {
			Messages.addGlobalError("Ocorreu um erro ao tentar listar o estado.");
			e.printStackTrace();
		}
	}

	public void delete(ActionEvent event) {
		try {
			state = (State) event.getComponent().getAttributes().get("stateSelected");

			StateDAO stateDAO = new StateDAO();
			stateDAO.delete(state);

			states = stateDAO.list();

			Messages.addGlobalInfo("Estado removido com sucesso");
		} catch (RuntimeException e) {
			Messages.addGlobalError("Ocorreu um erro ao tentar remover o estado.");
			e.printStackTrace();
		}
	}

	public void update(ActionEvent event) {
		state = (State) event.getComponent().getAttributes().get("stateSelected");
	}

}

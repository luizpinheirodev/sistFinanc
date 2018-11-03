package br.com.financeiro.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class State extends GenericDomain {

	@Column(length = 2, nullable = false)
	private String initials;

	@Column(length = 50, nullable = false)
	private String name;

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

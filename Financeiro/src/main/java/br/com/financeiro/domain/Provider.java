package br.com.financeiro.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Provider extends GenericDomain {

	@Column(length = 50, nullable = false)
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}

package br.com.financeiro.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product extends GenericDomain {

	@Column(length = 80, nullable = false)
	private String description;

	@Column(nullable = false)
	private Short quantity;

	@Column(nullable = false, precision = 6, scale = 2)
	private BigDecimal price;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Provider provider;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Short getQuantity() {
		return quantity;
	}

	public void setQuantity(Short quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

}

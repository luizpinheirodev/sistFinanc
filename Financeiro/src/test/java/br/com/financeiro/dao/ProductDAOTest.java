package br.com.financeiro.dao;

import java.math.BigDecimal;

import org.junit.Ignore;
import org.junit.Test;

import br.com.financeiro.domain.Product;
import br.com.financeiro.domain.Provider;

public class ProductDAOTest {

		@Test
		@Ignore
		public void save(){
			ProviderDAO providerDAO = new ProviderDAO();
			Provider provider = providerDAO.find(new Long("2"));
			
			Product product = new Product();
			product.setDescription("Curso de Java");
			product.setProvider(provider);
			product.setPrice(new BigDecimal("13.70"));
			product.setQuantity(new Short("7"));
			
			ProductDAO productDAO = new ProductDAO();
			productDAO.save(product);
			
			System.out.println("Produto salvo com sucesso");
		}
	

}

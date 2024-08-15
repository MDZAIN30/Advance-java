package com.zrude.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;


import com.zrude.entities.Product;

@Component
public class productdao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void createProduct(Product product)
	{
		
		this.hibernateTemplate.save(product);
	}
	
	
	public List<Product> getAllProducts()

	{
		List<Product> allproducts=this.hibernateTemplate.loadAll(Product.class);
		
	return allproducts;
	}
	
	@Transactional
	public void deleteproduct(int pid)
	{
		Product p=this.hibernateTemplate.load(Product.class, pid);
		this.hibernateTemplate.delete(p);
		
	}
	
	public Product getProduct(int pid)
	{
		
		Product p= this.hibernateTemplate.load(Product.class, pid);
		
		return p;
	}
	
	
	@Transactional
	public void updateProduct(Product product) {
	    // Save the updated product
	    hibernateTemplate.update(product);
	}


	
}

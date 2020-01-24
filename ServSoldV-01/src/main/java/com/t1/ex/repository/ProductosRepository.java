package com.t1.ex.repository;

import org.springframework.data.repository.CrudRepository;

import com.t1.ex.dat.Product;
	
	public interface ProductosRepository extends CrudRepository<Product, Integer> {

		Product findFirstByCodigo(String codigo);
		
		
	    
	}


	

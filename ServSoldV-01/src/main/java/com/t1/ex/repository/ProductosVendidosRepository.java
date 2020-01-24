package com.t1.ex.repository;

import org.springframework.data.repository.CrudRepository;

import com.t1.ex.dat.ProductoVendido;

public interface ProductosVendidosRepository extends CrudRepository<ProductoVendido, Integer> {

}

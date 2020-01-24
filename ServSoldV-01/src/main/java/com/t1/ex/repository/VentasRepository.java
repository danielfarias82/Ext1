package com.t1.ex.repository;

import org.springframework.data.repository.CrudRepository;

import com.t1.ex.dat.Venta;

public interface VentasRepository extends CrudRepository<Venta, Integer> {
}

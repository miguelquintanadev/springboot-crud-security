package com.miguel.springboot.app.springbootcrudsecurity.repositories;

import org.springframework.data.repository.CrudRepository;

import com.miguel.springboot.app.springbootcrudsecurity.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{
    
    boolean existsBySku(String sku);
}

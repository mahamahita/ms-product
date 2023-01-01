package com.ensa.msproduct.dao;

import com.ensa.msproduct.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {

    public Product findByDesignation(String Product);
}

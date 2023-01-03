package com.ensa.msproduct.dao;

import com.ensa.msproduct.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import java.util.List;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("Select p from Product p where p.designation like %:designation%")

    public List<Product> findProductByDesignation(String designation);
    public Product findProductById(Long id);

}

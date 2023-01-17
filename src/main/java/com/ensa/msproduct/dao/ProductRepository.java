package com.ensa.msproduct.dao;

import com.ensa.msproduct.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import java.util.List;

@RepositoryRestResource
public interface ProductRepository extends MongoRepository<Product, Long> {
    @Query("value = \"{'designation': {$regex: ?0, $options: 'i'}}\"")

    public List<Product> findProductByDesignation(String designation);
    public Product findProductById(Long id);

}

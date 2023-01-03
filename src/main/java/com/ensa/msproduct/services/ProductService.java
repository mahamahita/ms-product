package com.ensa.msproduct.services;

import com.ensa.msproduct.entities.Product;
import com.ensa.msproduct.exceptions.EntityNotFoundException;

import java.util.List;

public interface ProductService {

    List<Product> listProduct();
    public Product getProductById(Long id);
    public void createProduct(Product product);

    public Product updateProduct(Product product,Long id);
    public   List<Product> getProductByDesignation(String designation);
    public void deleteProduct(Long id);
}

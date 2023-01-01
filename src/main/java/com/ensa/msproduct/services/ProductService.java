package com.ensa.msproduct.services;

import com.ensa.msproduct.entities.Product;

import java.util.List;

public interface ProductService {

    List<Product> listProduct();
    public Product getProductById(Long id);
    public void createProduct(Product product);

    public void updateProduct(Product customer);
    public Product getProductByDesignation(String designation);
    public void deleteProduct(Long id);
}

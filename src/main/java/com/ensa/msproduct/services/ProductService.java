package com.ensa.msproduct.services;

import com.ensa.msproduct.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> listProduct();

    List<Product> createProduct(List<Product> listProduct);

    List<Product> getProduct();

    List<Product> getProductById(List<Long> productIdList);
}

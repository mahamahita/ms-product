package com.ensa.msproduct.web;

import com.ensa.msproduct.entities.Product;
import com.ensa.msproduct.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class ProductControllerImpl implements ProductController {


    private ProductService productService;

    public ProductControllerImpl(ProductService productService) {
        this.productService = productService;
    }


    @Override
    public List<Product> createProduct(List<Product> listProduct) {
       return productService.createProduct(listProduct);
    }

    @Override
    public List<Product> getProduct() {
        return productService.getProduct();
    }

    @Override
    public List<Product> getProductsById(List<Long> productIdList) {
        return productService.getProductById(productIdList);
    }


    @Override
    public List<Product> products() {
        return productService.listProduct();
    }
}
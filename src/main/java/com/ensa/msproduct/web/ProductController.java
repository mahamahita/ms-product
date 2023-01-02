package com.ensa.msproduct.web;

import com.ensa.msproduct.entities.Product;
import com.ensa.msproduct.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface ProductController {



    public ResponseEntity<Product> getProductById(@PathVariable Long id);




    public List<Product> products();





    public void createProduct(@RequestBody Product product);

    public void updateProduct(@RequestBody Product product);

    public  ResponseEntity<Product> getProductByDesignation(@PathVariable String designation);

    public void deleteProduct(@PathVariable Long id);

}

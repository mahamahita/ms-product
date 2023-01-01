package com.ensa.msproduct.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ensa.msproduct.entities.Product;
import com.ensa.msproduct.services.ProductService;
@RestController
@RequestMapping("/products")
public class ProductController {


    private ProductService productService;

    public ProductController(ProductService productService) {

        this.productService = productService;
    }
    @GetMapping("/getProductById/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        return ResponseEntity.ok(productService.getProductById(id));
    }

    @PostMapping("/createProduct")
    public void createProduct(@RequestBody Product product) {
        productService.createProduct(product);
    }
    @PutMapping("/updateProduct")
    public void updateProduct(@RequestBody Product product) {
        productService.updateProduct(product);
    }
    @GetMapping("/getProductByDesignation/{designation}")
    public  ResponseEntity<Product> getProductByDesignation(@PathVariable String designation) {
        return ResponseEntity.ok(productService.getProductByDesignation(designation));
    }
    @GetMapping("/deleteProduct/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }

}
package com.ensa.msproduct.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ensa.msproduct.entities.Product;
import com.ensa.msproduct.services.ProductService;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/products")
public class ProductControllerImpl implements ProductController{


    private ProductService productService;

    public ProductControllerImpl(ProductService productService) {

        this.productService = productService;
    }
    @GetMapping("/{id}")
    @Override
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        return ResponseEntity.ok(productService.getProductById(id));
    }



    @GetMapping("")
    @Override
    public List<Product> products(){
        return productService.listProduct();
    }



    @PostMapping("")
    @Override
    public void createProduct(@RequestBody Product product) {
        productService.createProduct(product);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product,@PathVariable Long id) {
        Product updatedProduct = productService.updateProduct(product,id) ;
        return ResponseEntity.ok(updatedProduct) ;
    }
    @GetMapping("/getProductByDesignation/{designation}")
    @Override
    public  ResponseEntity<List<Product>> getProductByDesignation(@PathVariable String designation) {
        List<Product> products = productService.getProductByDesignation(designation);
        return ResponseEntity.ok(products) ;
    }
    @DeleteMapping("/{id}")
    @Override
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }

}
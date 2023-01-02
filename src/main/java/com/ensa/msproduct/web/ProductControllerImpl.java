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

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductControllerImpl implements ProductController{


    private ProductService productService;

    public ProductControllerImpl(ProductService productService) {

        this.productService = productService;
    }
    @GetMapping("/getProductById/{id}")
    @Override
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        return ResponseEntity.ok(productService.getProductById(id));
    }



    @GetMapping("/allProducts")
    @Override
    public List<Product> products(){
        return productService.listProduct();
    }



    @PostMapping("/createProduct")
    @Override

    public void createProduct(@RequestBody Product product) {
        productService.createProduct(product);
    }
    @PutMapping("/updateProduct")
    @Override

    public void updateProduct(@RequestBody Product product) {
        productService.updateProduct(product);
    }
    @GetMapping("/getProductByDesignation/{designation}")
    @Override

    public  ResponseEntity<Product> getProductByDesignation(@PathVariable String designation) {
        return ResponseEntity.ok(productService.getProductByDesignation(designation));
    }
    @GetMapping("/deleteProduct/{id}")
    @Override

    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }

}
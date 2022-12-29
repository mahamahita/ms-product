package com.ensa.msproduct.web;

import com.ensa.msproduct.dao.ProductRepository;
import com.ensa.msproduct.entities.Product;
import com.ensa.msproduct.services.ProductService;
import com.ensa.msproduct.services.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/products")
public interface ProductController {

   @PostMapping("/createProduct")
   public List<Product> createProduct(@RequestBody List<Product> listProduct);

   @GetMapping("/getProduct")
   public List<Product> getProduct();

   @GetMapping("/getProduct/{productIdList")
   public List<Product> getProductsById(@PathVariable List<Long> productIdList);

    @GetMapping("/pr")
    List<Product> products();
}
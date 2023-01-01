package com.ensa.msproduct.services;

import com.ensa.msproduct.dao.ProductRepository;
import com.ensa.msproduct.entities.Product;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        super();
        this.productRepository = productRepository;
    }
    @Override
    public List<Product> listProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {

        if(id == null) {
            return null;
        }
        Product product=productRepository.findById(id).get();


        return product;
    }



    @Override
    public void createProduct(Product product) {

        productRepository.save(product);

    }

    @Override
    public void updateProduct(Product product) {

        productRepository.save(product);

    }

    @Override
    public Product getProductByDesignation(String designation) {

        if(designation == null) {
            return null;
        }

        Product product=productRepository.findByDesignation(designation);

        return product;
    }

    @Override
    public void deleteProduct(Long id) {

        productRepository.deleteById(id);

    }

}
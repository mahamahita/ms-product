package com.ensa.msproduct.services;

import com.ensa.msproduct.dao.ProductRepository;
import com.ensa.msproduct.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        super();
        this.repository = repository;
    }

    @Override
    public Product getProductById(Long id) {

        if(id == null) {
            return null;
        }
        Product product=repository.findById(id).get();


        return product;
    }



    @Override
    public void createProduct(Product product) {

        repository.save(product);

    }

    @Override
    public void updateProduct(Product product) {

        repository.save(product);

    }

    @Override
    public Product getProductByDesignation(String designation) {

        if(designation == null) {
            return null;
        }

        Product product=repository.findByDesignation(designation);

        return product;
    }

    @Override
    public void deleteProduct(Long id) {

        repository.deleteById(id);

    }

}
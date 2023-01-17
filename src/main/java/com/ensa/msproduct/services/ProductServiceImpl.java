package com.ensa.msproduct.services;

import com.ensa.msproduct.dao.ProductRepository;
import com.ensa.msproduct.entities.Product;
import com.ensa.msproduct.exceptions.EntityAlreadyExistsException;
import com.ensa.msproduct.exceptions.EntityNotFoundException;
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
    public void createProduct(Product product)  {
        if(productRepository.findProductById(product.getId()) != null ){
            throw new EntityAlreadyExistsException("This product already exists");
        }
        productRepository.save(product);

    }

    @Override
    public Product updateProduct(Product product,Long id) {

        if(productRepository.findProductById(id) == null ){
            throw new EntityNotFoundException("There is no product with this id");
        }
        Product updatedProduct = productRepository.findById(id).get();
        updatedProduct.setDesignation(product.getDesignation());
        updatedProduct.setPrice(product.getPrice());
        updatedProduct.setPhoto(product.getPhoto());
        updatedProduct.setDepositQuantity(product.getDepositQuantity());
        updatedProduct.setExpiryDate(product.getExpiryDate());
        updatedProduct.setDescription(product.getDescription());


        return productRepository.save(updatedProduct);
    }

    @Override
    public List<Product> getProductByDesignation(String designation) {
        List<Product> products = productRepository.findProductByDesignation(designation);
        if(products.isEmpty() ){
            throw new EntityNotFoundException("cannot find any product with this designation" );
        }
        return products;
    }

    @Override
    public Product getProductById(Long id) {
        Product product=productRepository.findProductById(id);

        if(productRepository.findProductById(id) == null ){
            throw new EntityNotFoundException("There is no Product with the id you entered !");
        }
        return product;

    }


    @Override
    public void deleteProduct(Long id) {
        if(productRepository.findProductById(id) == null ){
            throw new EntityNotFoundException("There is no product with this id");
        }
        productRepository.deleteById(id);

    }

}
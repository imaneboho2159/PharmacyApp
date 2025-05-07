package com.pharmacyapp.service;


import com.pharmacyapp.model.Product;
import com.pharmacyapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

@Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts(){
    return productRepository.findAll();
    }
public Optional<Product> getProductById(Long id){
    return productRepository.findById(id);
}

}

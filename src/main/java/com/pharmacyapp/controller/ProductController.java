package com.pharmacyapp.controller;


import com.pharmacyapp.model.Product;
import com.pharmacyapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }
    @GetMapping
    public List<Product> getAllProduct(){
        return productService.getAllProducts();
    }
    @GetMapping("/{id}")
    public  Product getProductById(@PathVariable Long id){
        return productService.getProductById(id).orElseThrow();
    }
    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);

    }
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id,@RequestBody Product product){
        return productService.updateProduct(id,product);
    }


}

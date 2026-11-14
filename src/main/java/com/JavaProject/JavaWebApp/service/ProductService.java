package com.JavaProject.JavaWebApp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.JavaProject.JavaWebApp.model.Product;

@Service 
public class ProductService {

    
    public List<Product> getProductDetails() {
        return Arrays.asList(
            new Product("1", "Laptop", 999.99),
            new Product("2", "Smartphone", 599.99),
            new Product("3", "Tablet", 299.99)
        );
    }
}

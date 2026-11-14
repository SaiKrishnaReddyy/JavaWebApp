package com.JavaProject.JavaWebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JavaProject.JavaWebApp.model.Product;
import com.JavaProject.JavaWebApp.service.ProductService;

@RestController 
public class ProductController {

    @Autowired
    ProductService productService;
    
    @RequestMapping("/products")
    public List<Product> getProductDetails() {
        return productService.getProductDetails();
    }
}

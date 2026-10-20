package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Product;

@RestController 
@RequestMapping ("/products")
public class ProductController {

    @GetMapping("")
    public Product getProductDetails() {
       Product product = new Product();
         product.setId(1L);
          product.setName("Iphone 13");
          product.setPrice(999.99);
          return product;
    }
    
    
}
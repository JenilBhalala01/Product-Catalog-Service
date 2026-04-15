package com.example.product.service;

import com.example.product.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    public List<Product> getAllProducts(){
        return List.of(
                new Product(1L, "Laptop", 50000),
                new Product(2L, "Mobile", 20000),
                new Product(3L, "Headphones", 3000)
        );
    }
}

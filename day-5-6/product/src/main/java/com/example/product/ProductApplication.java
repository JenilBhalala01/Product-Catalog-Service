package com.example.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);

        System.out.println("Product Catalog Spring Boot Application Started...");
        System.out.println("Application running on: http://localhost:8080");
    }
}

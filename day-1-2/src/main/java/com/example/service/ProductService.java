package com.example.service;

import com.example.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductService {
    private List<Product> products = new ArrayList<>();

    // Constructor - add sample products
    public ProductService() {
        products.add(new Product(1L, "Laptop", 999.99));
        products.add(new Product(2L, "Phone", 499.99));
        products.add(new Product(3L, "Tablet", 299.99));
        products.add(new Product(4L, "Monitor", 199.99));
        products.add(new Product(5L, "Keyboard", 49.99));
    }

    // filter products above a given price
    public List<Product> getProductsAbovePrice(double price) {
        return products.stream().filter(p -> p.getPrice() > price).toList();
    }

    // return only product names with null checks
    public List<String> getProductNames() {
        return products.stream().map(Product::getName).toList();
    }

    // find product by name safely using Optional
    public Optional<Product> findByName(String name) {
        return products.stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .findFirst();
    }
}

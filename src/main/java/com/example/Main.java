package com.example;

import com.example.model.Product;

public class Main {
    static void main() {
        Product product = new Product(1L, "Laptop", 999.99);

        System.out.println("Product name: " + product.getName());
    }
}

package com.example;

import com.example.model.Product;
import com.example.service.ProductService;

import java.util.List;
import java.util.Optional;

public class Main {
    static void main() {
        Product product = new Product(1L, "Laptop", 999.99);
        System.out.println("Product name: " + product.getName());

        ProductService service = new ProductService();

        // products above price 200
        System.out.println("\n=== Products above 300 ===");
        List<Product> expensive = service.getProductsAbovePrice(300);
        expensive.forEach(p -> System.out.println(p.getName() + " - " + p.getPrice()));

        // all product names
        System.out.println("\n=== All Product Names ===");
        List<String> names = service.getProductNames();
        names.forEach(System.out::println);

        // Optional safe access
        System.out.println("\n=== Find by Name ===");
        Optional<Product> found = service.findByName("Laptop");
        found.ifPresent(p -> System.out.println("Found: " + p.getName() + " at " + p.getPrice()));

        Optional<Product> notFound = service.findByName("Smartwatch");
        System.out.println("Smartwatch found: " + notFound.isPresent());
    }
}

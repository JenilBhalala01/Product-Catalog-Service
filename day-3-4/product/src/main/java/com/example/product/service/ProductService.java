package com.example.product.service;

import com.example.product.dto.ProductDTO;
import com.example.product.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private Long idCounter = 1L;

    public List<Product> getAllProducts(){
        return products;
    }

    public Product getProductById(Long id){
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public Product createProduct(ProductDTO dto) {
        Product product = new Product(idCounter++, dto.getName(), dto.getPrice());
        products.add(product);
        return product;
    }
}

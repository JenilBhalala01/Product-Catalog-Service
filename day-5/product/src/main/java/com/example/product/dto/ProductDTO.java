package com.example.product.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class ProductDTO {
    @NotNull(message = "Name is required")
    private String name;

    @Min(value = 1, message = "Price must be greater than 0")
    private double price;
}

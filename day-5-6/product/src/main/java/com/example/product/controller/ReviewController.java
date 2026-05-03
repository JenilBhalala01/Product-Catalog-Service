package com.example.product.controller;

import com.example.product.dto.ReviewDTO;
import com.example.product.model.Review;
import com.example.product.service.ProductService;
import com.example.product.service.ReviewService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products/{productId}/reviews")
@RequiredArgsConstructor
public class ReviewController {
    private final ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> addReview(@PathVariable Long productId, @Valid @RequestBody ReviewDTO review) {
        return ResponseEntity.status(HttpStatus.CREATED).body(reviewService.addReviews(productId, review));
    }
}

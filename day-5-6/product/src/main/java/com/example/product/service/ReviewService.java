package com.example.product.service;

import com.example.product.dto.ReviewDTO;
import com.example.product.exception.ProductNotFoundException;
import com.example.product.model.Product;
import com.example.product.model.Review;
import com.example.product.repository.ProductRepository;
import com.example.product.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReviewService {
    private final ProductRepository productRepository;
    private final ReviewRepository reviewRepository;

    public Review addReviews(Long productId, ReviewDTO reviewDTO) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new ProductNotFoundException(productId));

        Review review = new Review();
        review.setComment(reviewDTO.getComment());
        review.setProduct(product);

        return reviewRepository.save(review);
    }
}

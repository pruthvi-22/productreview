package com.example.nxttrendz1.repository;

import com.example.nxttrendz1.model.Review;
import org.springframework.stereotype.Repository;
import com.example.nxttrendz1.model.Product;

import java.util.ArrayList;

@Repository
public interface ReviewRepository {
    ArrayList<Review> getReviews();

    Review getReviewById(int reviewId);

    Review addReview(Review review);

    Review updateReview(int reviewId, Review review);

    void deleteReview(int reviewId);

    Product getReviewProduct(int productId);
}

package com.dev.spring.accessor;

import com.dev.spring.controller.models.Review;
import com.dev.spring.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatabaseAccessor {
    private final ReviewRepository repository;

    public DatabaseAccessor(ReviewRepository repo) {
        this.repository = repo;
    }

    public void postReview(Review review) {
        repository.save(review);
    }

    /*
    * Gets review by searching the DB with a title
    * @args
    * title - the name of the anime or manga
    */
    public List<Review> getReviewsByTitle(String title) {
        return repository.findAllByMangaTitle(title);
    }

}

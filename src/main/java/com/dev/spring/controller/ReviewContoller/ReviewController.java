package com.dev.spring.controller.ReviewContoller;

import com.dev.spring.accessor.DatabaseAccessor;
import com.dev.spring.controller.API_Endpoints;
import com.dev.spring.controller.models.Review;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(API_Endpoints.GET_REVIEW_BY_TITLE)
@CrossOrigin(origins = "http://localhost:3000")
public class ReviewController {
    private final DatabaseAccessor db;

    public ReviewController(DatabaseAccessor db) {
        this.db = db;
    }

    @GetMapping
    public List<Review> getReviewsByTitle(@RequestParam(name = "title") String title ) {
        return db.getReviewsByTitle(title);
    }

    @PostMapping
    public Review postReview(@RequestBody Review reviewEntry) {
        db.postReview(new Review(reviewEntry.getContent(), reviewEntry.getMangaTitle()));
        return reviewEntry;
    }
}

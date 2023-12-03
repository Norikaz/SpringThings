package com.dev.spring;
import com.dev.spring.accessor.DatabaseAccessor;
import com.dev.spring.controller.models.Review;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    private final DatabaseAccessor repository;

    public DataInitializer(DatabaseAccessor repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Insert starter data here
        repository.postReview(new Review("This rocks", "JJK"));
        repository.postReview(new Review("LOVE THIS SHOW", "Berserk"));
    }
}
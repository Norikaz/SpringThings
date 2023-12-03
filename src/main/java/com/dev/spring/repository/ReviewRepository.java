package com.dev.spring.repository;

import com.dev.spring.controller.models.Review;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReviewRepository extends CrudRepository<Review, Long> {
    List<Review> findAllByMangaTitle(String mangaTitle);
}

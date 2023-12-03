package com.dev.spring.controller.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Getter
    private String content;
    @Getter
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String mangaTitle;

    public Review() {}

    public Review( String content, String mangaTitle) {
        this.content = content;
        this.mangaTitle = mangaTitle;
    }
}

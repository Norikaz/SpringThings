package com.dev.spring.controller.models.sample;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Builder // adds builder pattern for this class
@Data // adds basic boiler plate setter getter and constructors in the background
public class User {
    private final String name;
    private final int age;

    //if the class is simple the above should be enough

    //If your class requires more logic you should make a method that that simplifies the creation
    public User createUser(@NonNull final String name, final int age){
        return User.builder()
                .name(formatName(name))
                .age(10)
                .build();
    }

    private final String formatName(@NonNull final String name) {
        return name.toLowerCase();
    }
}

package com.github.andreldsr.gymmanager.web.request;

import com.github.andreldsr.gymmanager.data.model.Exercise;

public class CreateExerciseRequest {
    private String name;
    private String image;
    private String video;
    private String description;
    private int repetitions;
    private int series;

    public Exercise toDomain(){
        return Exercise.builder()
                .name(name)
                .image(image)
                .description(description)
                .repetitions(repetitions)
                .series(series)
                .build();
    }
}

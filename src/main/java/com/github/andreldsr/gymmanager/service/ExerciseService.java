package com.github.andreldsr.gymmanager.service;

import com.github.andreldsr.gymmanager.data.model.Exercise;
import com.github.andreldsr.gymmanager.web.request.CreateExerciseRequest;

import java.util.List;

public interface ExerciseService {
    List<Exercise> findAll();
    Exercise save(CreateExerciseRequest exercise);
    Boolean deleteById(Long id);
}

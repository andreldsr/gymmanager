package com.github.andreldsr.gymmanager.service.impl;

import com.github.andreldsr.gymmanager.data.model.Exercise;
import com.github.andreldsr.gymmanager.data.repository.ExerciseRepository;
import com.github.andreldsr.gymmanager.service.ExerciseService;
import com.github.andreldsr.gymmanager.web.request.CreateExerciseRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ExerciseServiceImpl implements ExerciseService {
    private ExerciseRepository exerciseRepository;

    @Override
    public List<Exercise> findAll() {
        return exerciseRepository.findAll();
    }

    @Override
    public Exercise save(CreateExerciseRequest exercise) {
        return exerciseRepository.save(exercise.toDomain());
    }

    @Override
    public Boolean deleteById(Long id) {
        exerciseRepository.deleteById(id);
        return true;
    }
}

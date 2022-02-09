package com.github.andreldsr.gymmanager.web.controller;

import com.github.andreldsr.gymmanager.data.model.Exercise;
import com.github.andreldsr.gymmanager.service.ExerciseService;
import com.github.andreldsr.gymmanager.web.request.CreateExerciseRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercise")
@AllArgsConstructor
public class ExerciseController {
    private ExerciseService exerciseService;
    @GetMapping
    public ResponseEntity<List<Exercise>> getAll(){
        return ResponseEntity.ok(exerciseService.findAll());
    }

    @PostMapping
    public ResponseEntity<Exercise> save(@RequestBody CreateExerciseRequest createExerciseRequest){
        return ResponseEntity.ok(exerciseService.save(createExerciseRequest));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteById(@PathVariable Long id){
        return ResponseEntity.ok(exerciseService.deleteById(id));
    }
}

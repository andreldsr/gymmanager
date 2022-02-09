package com.github.andreldsr.gymmanager.data.repository;

import com.github.andreldsr.gymmanager.data.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
}

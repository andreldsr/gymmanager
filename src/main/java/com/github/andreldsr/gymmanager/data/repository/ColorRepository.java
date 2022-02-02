package com.github.andreldsr.gymmanager.data.repository;

import com.github.andreldsr.gymmanager.data.model.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRepository extends JpaRepository<Color, Long> {
    Color findByName(String name);
}

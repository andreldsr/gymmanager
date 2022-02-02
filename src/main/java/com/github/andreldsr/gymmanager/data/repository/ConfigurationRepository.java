package com.github.andreldsr.gymmanager.data.repository;

import com.github.andreldsr.gymmanager.data.model.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigurationRepository extends JpaRepository<Configuration, Long> {
}

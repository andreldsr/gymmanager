package com.github.andreldsr.gymmanager.service.impl;

import com.github.andreldsr.gymmanager.data.model.Color;
import com.github.andreldsr.gymmanager.data.repository.ColorRepository;
import com.github.andreldsr.gymmanager.service.ColorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ColorServiceImpl implements ColorService {
    private ColorRepository colorRepository;
    @Override
    public List<Color> getAll() {
        return colorRepository.findAll();
    }
}

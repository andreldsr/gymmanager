package com.github.andreldsr.gymmanager.web.controller;

import com.github.andreldsr.gymmanager.data.model.Color;
import com.github.andreldsr.gymmanager.service.ColorService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/color")
@AllArgsConstructor
public class ColorController {
    private ColorService colorService;
    @GetMapping
    public ResponseEntity<List<Color>> getAll(){
        return ResponseEntity.ok(colorService.getAll());
    }
}

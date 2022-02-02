package com.github.andreldsr.gymmanager.web.controller;

import com.github.andreldsr.gymmanager.data.model.Configuration;
import com.github.andreldsr.gymmanager.service.ConfigurationService;
import com.github.andreldsr.gymmanager.web.request.ChangeConfigurationRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/configuration")
@AllArgsConstructor
public class ConfigurationController {
    private ConfigurationService configurationService;

    @GetMapping
    public ResponseEntity<Configuration> getConfiguration(){
        return ResponseEntity.ok(configurationService.getConfiguration());
    }

    @PostMapping
    public ResponseEntity<Configuration> changeConfiguration(@RequestBody ChangeConfigurationRequest changeConfigurationRequest){
        return ResponseEntity.ok(configurationService.changeConfiguration(changeConfigurationRequest));
    }
}

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
    public ResponseEntity<ChangeConfigurationRequest> getConfiguration(){
        return ResponseEntity.ok(configurationService.getConfiguration());
    }

    @GetMapping("/full")
    public ResponseEntity<Configuration> getConfigurationFull(){
        return ResponseEntity.ok(configurationService.getConfigurationFull());
    }

    @PostMapping
    public ResponseEntity<Configuration> changeConfiguration(@RequestBody ChangeConfigurationRequest changeConfigurationRequest){
        return ResponseEntity.ok(configurationService.changeConfiguration(changeConfigurationRequest));
    }
}

package com.github.andreldsr.gymmanager.service;

import com.github.andreldsr.gymmanager.data.model.Configuration;
import com.github.andreldsr.gymmanager.web.request.ChangeConfigurationRequest;

public interface ConfigurationService {
    public Configuration getConfiguration();

    public Configuration changeConfiguration(ChangeConfigurationRequest changeConfigurationRequest);
}

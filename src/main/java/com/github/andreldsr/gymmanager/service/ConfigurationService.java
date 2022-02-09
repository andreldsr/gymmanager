package com.github.andreldsr.gymmanager.service;

import com.github.andreldsr.gymmanager.data.model.Configuration;
import com.github.andreldsr.gymmanager.web.request.ChangeConfigurationRequest;

public interface ConfigurationService {
    Configuration getConfigurationFull();

    ChangeConfigurationRequest getConfiguration();

    Configuration changeConfiguration(ChangeConfigurationRequest changeConfigurationRequest);
}

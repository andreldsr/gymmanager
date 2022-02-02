package com.github.andreldsr.gymmanager.service.impl;

import com.github.andreldsr.gymmanager.data.model.Configuration;
import com.github.andreldsr.gymmanager.data.repository.ColorRepository;
import com.github.andreldsr.gymmanager.data.repository.ConfigurationRepository;
import com.github.andreldsr.gymmanager.service.ConfigurationService;
import com.github.andreldsr.gymmanager.web.request.ChangeConfigurationRequest;
import lombok.AllArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ConfigurationServiceImpl implements ConfigurationService {
    private ConfigurationRepository configurationRepository;
    private ColorRepository colorRepository;

    @Override
    public Configuration getConfiguration() {
        val all = configurationRepository.findAll();
        if(!all.isEmpty())
            return all.get(0);
        return null;
    }

    @Override
    public Configuration changeConfiguration(ChangeConfigurationRequest changeConfigurationRequest) {
        val primaryColor = colorRepository.findByName(changeConfigurationRequest.getPrimaryColor());
        val secondaryColor = colorRepository.findByName(changeConfigurationRequest.getSecondaryColor());
        val configuration = getConfiguration();
        configuration.setPrimaryColor(primaryColor.getPrimaryColor());
        configuration.setDarkPrimaryColor(primaryColor.getDarkPrimaryColor());
        configuration.setLightPrimaryColor(primaryColor.getLightPrimaryColor());
        configuration.setTextIconColor(primaryColor.getTextIconColor());
        configuration.setSecondaryColor(secondaryColor.getPrimaryColor());
        configuration.setBodyTextFont(changeConfigurationRequest.getBodyTextFont());
        configuration.setHeadingTextFont(changeConfigurationRequest.getHeadingTextFont());
        configuration.setBlackPageTitle(changeConfigurationRequest.isBlackPageTitle());
        configuration.setLogoColor(changeConfigurationRequest.getLogoColor());
        return configurationRepository.save(configuration);
    }
}

package com.github.andreldsr.gymmanager.web.request;

import lombok.*;

import javax.persistence.Column;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChangeConfigurationRequest {
    private String name;
    private boolean blackPageTitle;
    private String primaryColor;
    private String secondaryColor;
    private boolean showExercisePhoto;
    private String logoColor;
    private String headingTextFont;
    private String bodyTextFont;
}

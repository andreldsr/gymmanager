package com.github.andreldsr.gymmanager.data.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Configuration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "black_page_title")
    private boolean blackPageTitle;
    @Column(name = "primary_color")
    private String primaryColor;
    @Column(name = "light_primary_color")
    private String lightPrimaryColor;
    @Column(name = "dark_primary_color")
    private String darkPrimaryColor;
    @Column(name = "text_icon_color")
    private String textIconColor;
    @Column(name = "secondary_color")
    private String secondaryColor;
    @Column(name = "text_color")
    private String textColor;
    @Column(name = "secondary_text_color")
    private String secondaryTextColor;
    @Column(name = "divider_color")
    private String dividerColor;
    @Column(name = "background_color")
    private String backgroundColor;
    @Column(name = "list_type")
    private String listType;
    @Column(name = "show_exercise_photo")
    private boolean showExercisePhoto;
    @Column(name = "logo_color")
    private String logoColor;
    @Column(name = "heading_text_font")
    private String headingTextFont;
    @Column(name = "body_text_font")
    private String bodyTextFont;
}

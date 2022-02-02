package com.github.andreldsr.gymmanager.data.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String name;
    @Column(name = "primary_color")
    private String primaryColor;
    @Column(name = "light_primary_color")
    private String lightPrimaryColor;
    @Column(name = "dark_primary_color")
    private String darkPrimaryColor;
    @Column(name = "text_icon_color")
    private String textIconColor;
}

package com.github.andreldsr.gymmanager.data.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @Column(columnDefinition = "text")
    private String image;
    private String video;
    @Column(columnDefinition = "text")
    private String description;
    private int repetitions;
    private int series;
}

package com.greenify.ecohub.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.awt.*;
import java.sql.Blob;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "speakers")
public class Speaker {

    @Id // this is telling hibernate this column is the PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // this telling hibernate that the PK is auto increment
    @Column(name = "id")
    private Integer id;

    @ToString.Exclude
    @JoinColumn(name = "first_name", nullable = true)
    private String firstName;

    @ToString.Exclude
    @JoinColumn(name = "last_name", nullable = true)
    private String lastName;

    @ToString.Exclude
    @JoinColumn(name = "organization", nullable = true)
    private String organization;

    @ToString.Exclude
    @JoinColumn(name = "title", nullable = true)
    private String title;

    @ToString.Exclude
    @JoinColumn(name = "about", nullable = true)
    private String about;

    @ToString.Exclude
    @JoinColumn(name = "speaker_img")
    private String speakerImg;
}


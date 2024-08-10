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

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "organization", nullable = true)
    private String organization;

    @Column(name = "title")
    private String title;

    @Column(name = "about")
    private String about;

    @Column(name = "speaker_img")
    private String speakerImg;
}


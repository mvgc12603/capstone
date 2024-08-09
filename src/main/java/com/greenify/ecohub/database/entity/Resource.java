package com.greenify.ecohub.database.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "resources")
public class Resource {

    @Id // this is telling hibernate this column is the PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // this telling hibernate that the PK is auto increment
    @Column(name = "id")
    private Integer id;

    @ToString.Exclude
    // @EqualsAndHashCode.Exclude, is a thing that could be useful
    @JoinColumn(name = "type", nullable = true)
    private String type;

    @ToString.Exclude
    @JoinColumn(name = "link", nullable = true)
    private String link;

    @ToString.Exclude
    @JoinColumn(name = "description", nullable = true)
    private String description;
}

package com.greenify.ecohub.database.entity;


import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_resources")


public class UserResource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "resource_id", insertable = false, updatable = false) //latter two prevent setResourceId, adds extra verification
    private Integer resourceId;

    @Column(name = "user_id", insertable=false, updatable=false)
    private Integer userId;

    @ToString.Exclude //avoids recursion
    @ManyToOne(fetch=FetchType.LAZY, optional = false)
    @JoinColumn(name="user_id", nullable = false)
    private User user; //used in mappedBy in OneToMany User entity, access point

    @ToString.Exclude
    @ManyToOne(fetch=FetchType.LAZY, optional = false)
    @JoinColumn(name="resource_id", nullable = false)
    private Resource resource;
}
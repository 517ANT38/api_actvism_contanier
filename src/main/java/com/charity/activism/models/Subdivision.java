package com.charity.activism.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
@Data
@NoArgsConstructor
public class Subdivision {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(mappedBy = "subdivision")
    @JsonIgnore
    private List<ActivismUser> activismUsers;

    public Subdivision(String name) {
        this.name = name;
    }

    
}

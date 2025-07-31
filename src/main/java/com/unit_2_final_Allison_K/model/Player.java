package com.unit_2_final_Allison_K.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Player {
    @Getter
    @Setter
    @Id //primary key
    @GeneratedValue ( strategy = jakarta.persistence.GenerationType.IDENTITY) //id auto-generation
    private Long id; //player's unique identifier
    private String name;
    private String email;

}

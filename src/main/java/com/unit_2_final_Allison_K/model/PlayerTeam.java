package com.unit_2_final_Allison_K.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class PlayerTeam {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id; // unique identifier for the player-team relationship

    @ManyToOne
    @JoinColumn (name = "player_id")
    private Player player; // reference to the Player entity

    @ManyToOne
    @JoinColumn ( name = "team_id")
    private Team team; // reference to the Team entity

}

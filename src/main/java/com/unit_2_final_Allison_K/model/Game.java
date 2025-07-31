package com.unit_2_final_Allison_K.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;


@Getter
@Setter
@Entity
public class Game {

    @Id
    @GeneratedValue (strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id; // unique identifier for the game

    //The team player is on
    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;
    private String opponentTeam; // the opponent team name
    private LocalDate date; // the date of the game
    private String dayOfWeek; // the day of the week the game is played
    private LocalTime time; // the local time of the game
    private String division; // the division of the game
}

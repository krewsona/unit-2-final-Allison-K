package com.unit_2_final_Allison_K.controller;

import com.unit_2_final_Allison_K.model.PlayerTeam;
import com.unit_2_final_Allison_K.repository.PlayerTeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/player-teams")
public class PlayerTeamController {
    @Autowired
    public PlayerTeamRepository playerTeamRepository;

    @GetMapping
    public List<PlayerTeam> getAllPlayerTeams() {
        return playerTeamRepository.findAll();
    }

    @PostMapping
    public PlayerTeam addPlayerToTeam(@RequestBody PlayerTeam playerTeam) {
        return playerTeamRepository.save(playerTeam);
    }
}

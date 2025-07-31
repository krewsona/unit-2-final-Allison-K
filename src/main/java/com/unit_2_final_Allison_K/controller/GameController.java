package com.unit_2_final_Allison_K.controller;
import com.unit_2_final_Allison_K.model.Game;
import com.unit_2_final_Allison_K.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/games")
public class GameController {

    @Autowired
    private GameRepository gameRepository;

    @GetMapping
    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    @PostMapping
    public Game createGame(@RequestBody Game game) {
        return gameRepository.save(game);
    }

    @GetMapping("/{id}")
    public Game updateGame(@PathVariable Long id, @RequestBody Game gameDetails) {
        Game game = gameRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Game not found with id: " + id));

        game.setTeam(gameDetails.getTeam());
        game.setOpponentTeam(gameDetails.getOpponentTeam());
        game.setDate(gameDetails.getDate());
        game.setDayOfWeek(gameDetails.getDayOfWeek());
        game.setTime(gameDetails.getTime());
        game.setDivision(gameDetails.getDivision());

        return gameRepository.save(game);
    }

    @DeleteMapping("/{id}")
    public void deleteGame(@PathVariable Long id) {
        gameRepository.deleteById(id);
    }

}

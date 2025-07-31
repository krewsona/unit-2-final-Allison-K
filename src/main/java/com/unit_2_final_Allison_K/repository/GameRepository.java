package com.unit_2_final_Allison_K.repository;
import com.unit_2_final_Allison_K.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}

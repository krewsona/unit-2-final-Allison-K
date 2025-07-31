package com.unit_2_final_Allison_K.repository;

import com.unit_2_final_Allison_K.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
// adding custom query methods here later
}

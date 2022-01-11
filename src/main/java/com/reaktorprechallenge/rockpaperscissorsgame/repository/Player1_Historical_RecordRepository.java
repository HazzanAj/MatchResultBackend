package com.reaktorprechallenge.rockpaperscissorsgame.repository;

import com.reaktorprechallenge.rockpaperscissorsgame.model.Player1_Historical_Record;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Player1_Historical_RecordRepository  extends JpaRepository<Player1_Historical_Record, Long> {
    void deletePlayer1_Historical_RecordById(Long id);

    Optional<Player1_Historical_Record> findPlayer1_Historical_RecordById(Long id);
}

package com.reaktorprechallenge.rockpaperscissorsgame.repository;

import com.reaktorprechallenge.rockpaperscissorsgame.model.Player2_Historical_Record;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Player2_Historical_RecordRepository extends JpaRepository<Player2_Historical_Record, Long> {
        void deletePlayer2_Historical_RecordById(Long id);

        Optional<Player2_Historical_Record> findPlayer2_Historical_RecordById(Long id);
        }

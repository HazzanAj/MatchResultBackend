package com.reaktorprechallenge.rockpaperscissorsgame.repository;

import com.reaktorprechallenge.rockpaperscissorsgame.model.GameInProgress;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GameInProgressRepository extends JpaRepository<GameInProgress, Long> {
    void deleteGameInProgressById(Long id);

    Optional<GameInProgress> findGameInProgressById(Long id);
}

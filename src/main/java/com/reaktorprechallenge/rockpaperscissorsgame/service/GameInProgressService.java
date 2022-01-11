package com.reaktorprechallenge.rockpaperscissorsgame.service;

import com.reaktorprechallenge.rockpaperscissorsgame.exception.GameInProgressNotFoundException;
import com.reaktorprechallenge.rockpaperscissorsgame.model.GameInProgress;
import com.reaktorprechallenge.rockpaperscissorsgame.repository.GameInProgressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class GameInProgressService {
    private final GameInProgressRepository gameInProgressRepository;

    @Autowired
    public GameInProgressService( GameInProgressRepository gameInProgressRepository){
        this.gameInProgressRepository = gameInProgressRepository;
    }
    /*** Setting a random code value to the GameInProgress ***/
    public GameInProgress addGameInProgress( GameInProgress gameInProgress){
        gameInProgress.setGameInProgressCode(UUID.randomUUID().toString());
        return gameInProgressRepository.save(gameInProgress);
    }
    /*** Getting list of the GameInProgress ***/
    public List<GameInProgress> findAllGameInProgress(){
        return gameInProgressRepository.findAll();
    }
    /*** Updating GameInProgress***/
    public GameInProgress updateGameInProgress(GameInProgress gameInProgress){
        return gameInProgressRepository.save(gameInProgress);
    }
    /*** Getting list of the GameInProgress by Id  ***/
    public GameInProgress findGameInProgressById(Long id){
     return gameInProgressRepository.findGameInProgressById(id)
             .orElseThrow(()-> new GameInProgressNotFoundException( "Game By Id" + id + "Not Found"));
    }

    /*** Deleting GameInProgress***/
    public void deleteGameInProgress( Long id){
    gameInProgressRepository.deleteGameInProgressById(id);
    }

}
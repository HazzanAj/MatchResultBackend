package com.reaktorprechallenge.rockpaperscissorsgame.controller;

import com.reaktorprechallenge.rockpaperscissorsgame.model.GameInProgress;
import com.reaktorprechallenge.rockpaperscissorsgame.service.GameInProgressService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/rps")
public class GameInProgressController {
    private final GameInProgressService gameInProgressService;

    public GameInProgressController( GameInProgressService gameInProgressService){
        this.gameInProgressService = gameInProgressService;
    }
    @GetMapping( "/history")
    public ResponseEntity<List<GameInProgress>> getGameInProgress(){
        List<GameInProgress> gameInProgresses = gameInProgressService.findAllGameInProgress();
        return new ResponseEntity<>(gameInProgresses, HttpStatus.OK);
    }
    @PostMapping("/live")
    public ResponseEntity<GameInProgress> addGameInProgress(@RequestBody GameInProgress
                                                            gameInProgress){
        GameInProgress newGameInProgress = gameInProgressService.addGameInProgress(gameInProgress);
        return new ResponseEntity<>(newGameInProgress, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<GameInProgress> updateGameInProgress(@RequestBody GameInProgress gameInProgress){
        GameInProgress updateGameInProgress = gameInProgressService.updateGameInProgress(gameInProgress);
        return new ResponseEntity<>(updateGameInProgress, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteGameInProgress(@PathVariable("id") Long id){
        gameInProgressService.deleteGameInProgress(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

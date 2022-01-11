package com.reaktorprechallenge.rockpaperscissorsgame.controller;


import com.reaktorprechallenge.rockpaperscissorsgame.model.Player1_Historical_Record;
import com.reaktorprechallenge.rockpaperscissorsgame.service.Player1_Historical_RecordService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/player1bad-api-rps")
public class Player1_Historical_RecordController {
    private final Player1_Historical_RecordService player1_Historical_RecordService;

    public Player1_Historical_RecordController( Player1_Historical_RecordService player1_Historical_RecordService){
        this.player1_Historical_RecordService = player1_Historical_RecordService;
    }
    @GetMapping( "/history")
    public ResponseEntity<List<Player1_Historical_Record>> getPlayer1_Historical_Record(){
        List<Player1_Historical_Record> player1_Historical_Record =  player1_Historical_RecordService.findAllPlayer1_Historical_Record();
        return new ResponseEntity<>(player1_Historical_Record, HttpStatus.OK);
    }
    @PostMapping("/live")
    public ResponseEntity<Player1_Historical_Record> addPlayer1_Historical_Record(@RequestBody Player1_Historical_Record
                                                                                               player1_Historical_Record){
        Player1_Historical_Record newPlayer1_Historical_Record =  player1_Historical_RecordService.addPlayer1_Historical_Record(player1_Historical_Record);
        return new ResponseEntity<>(newPlayer1_Historical_Record, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<Player1_Historical_Record> updatePlayer1_Historical_Record(@RequestBody Player1_Historical_Record player1_Historical_Record){
        Player1_Historical_Record updatePlayer1_Historical_Record = player1_Historical_RecordService.updatePlayer1_Historical_Record(player1_Historical_Record);
        return new ResponseEntity<>(updatePlayer1_Historical_Record, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePlayer1_Historical_Record(@PathVariable("id") Long id){
        player1_Historical_RecordService.deletePlayer1_Historical_Record(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

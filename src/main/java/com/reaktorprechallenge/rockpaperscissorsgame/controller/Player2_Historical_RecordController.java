package com.reaktorprechallenge.rockpaperscissorsgame.controller;


import com.reaktorprechallenge.rockpaperscissorsgame.model.Player2_Historical_Record;
import com.reaktorprechallenge.rockpaperscissorsgame.service.Player2_Historical_RecordService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/player2bad-api-rps")
public class Player2_Historical_RecordController {
    private final Player2_Historical_RecordService player2_Historical_RecordService;

    public Player2_Historical_RecordController( Player2_Historical_RecordService player2_Historical_RecordService){
        this.player2_Historical_RecordService = player2_Historical_RecordService;
    }
    @GetMapping( "/history")
    public ResponseEntity<List<Player2_Historical_Record>> getPlayer2_Historical_Record(){
        List<Player2_Historical_Record> player2_Historical_Record =  player2_Historical_RecordService.findAllPlayer2_Historical_Record();
        return new ResponseEntity<>(player2_Historical_Record, HttpStatus.OK);
    }
    @PostMapping("/live")
    public ResponseEntity<Player2_Historical_Record> addPlayer2_Historical_Record(@RequestBody Player2_Historical_Record
                                                                                          player2_Historical_Record){
        Player2_Historical_Record newPlayer2_Historical_Record =  player2_Historical_RecordService.addPlayer2_Historical_Record(player2_Historical_Record);
        return new ResponseEntity<>(newPlayer2_Historical_Record, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<Player2_Historical_Record> updatePlayer2_Historical_Record(@RequestBody Player2_Historical_Record player2_Historical_Record){
        Player2_Historical_Record updatePlayer2_Historical_Record = player2_Historical_RecordService.updatePlayer2_Historical_Record(player2_Historical_Record);
        return new ResponseEntity<>(updatePlayer2_Historical_Record, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePlayer2_Historical_Record(@PathVariable("id") Long id){
        player2_Historical_RecordService.deletePlayer2_Historical_Record(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

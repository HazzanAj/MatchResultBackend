package com.reaktorprechallenge.rockpaperscissorsgame.service;

import com.reaktorprechallenge.rockpaperscissorsgame.exception.Player1_Historical_RecordNotFoundException;
import com.reaktorprechallenge.rockpaperscissorsgame.exception.Player2_Historical_RecordNotFoundException;
import com.reaktorprechallenge.rockpaperscissorsgame.model.Player1_Historical_Record;
import com.reaktorprechallenge.rockpaperscissorsgame.model.Player2_Historical_Record;
import com.reaktorprechallenge.rockpaperscissorsgame.repository.Player1_Historical_RecordRepository;
import com.reaktorprechallenge.rockpaperscissorsgame.repository.Player2_Historical_RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class Player2_Historical_RecordService {
    private final Player2_Historical_RecordRepository player2_Historical_RecordRepository;

    @Autowired
    public Player2_Historical_RecordService ( Player2_Historical_RecordRepository player2_Historical_RecordRepository){
        this.player2_Historical_RecordRepository = player2_Historical_RecordRepository;
    }
    /*** Setting a random code value to the Player2_Historical_Record ***/
    public Player2_Historical_Record addPlayer2_Historical_Record(Player2_Historical_Record player2_Historical_Record){
        player2_Historical_Record.setPlayer2_Historical_RecordCode(UUID.randomUUID().toString());
        return player2_Historical_RecordRepository.save(player2_Historical_Record);
    }
    /*** Getting list of the Player2_Historical_Record ***/
    public List<Player2_Historical_Record> findAllPlayer2_Historical_Record(){
        return player2_Historical_RecordRepository.findAll();
    }
    /*** Updating Player2_Historical_Record***/
    public Player2_Historical_Record updatePlayer2_Historical_Record(Player2_Historical_Record player2_Historical_Record){
        return player2_Historical_RecordRepository.save(player2_Historical_Record);
    }
    /*** Getting list of the Player2_Historical_Record by Id  ***/
    public Player2_Historical_Record findPlayer2_Historical_RecordById(Long id){
        return player2_Historical_RecordRepository.findPlayer2_Historical_RecordById(id)
                .orElseThrow(()-> new Player2_Historical_RecordNotFoundException( "Player2 By Id" + id + "Not Found"));
    }

    /*** Deleting Player2_Historical_Record***/
    public void deletePlayer2_Historical_Record( Long id){
        player2_Historical_RecordRepository.deletePlayer2_Historical_RecordById(id);
    }

}

package com.reaktorprechallenge.rockpaperscissorsgame.service;

import com.reaktorprechallenge.rockpaperscissorsgame.exception.Player1_Historical_RecordNotFoundException;
import com.reaktorprechallenge.rockpaperscissorsgame.model.Player1_Historical_Record;
import com.reaktorprechallenge.rockpaperscissorsgame.repository.Player1_Historical_RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class Player1_Historical_RecordService {
    private final Player1_Historical_RecordRepository player1_Historical_RecordRepository;

    @Autowired
    public Player1_Historical_RecordService ( Player1_Historical_RecordRepository player1_Historical_RecordRepository){
        this.player1_Historical_RecordRepository = player1_Historical_RecordRepository;
    }
    /*** Setting a random code value to the Player1_Historical_Record ***/
    public Player1_Historical_Record addPlayer1_Historical_Record(Player1_Historical_Record player1_Historical_Record){
        player1_Historical_Record.setPlayer1_Historical_RecordCode(UUID.randomUUID().toString());
        return player1_Historical_RecordRepository.save(player1_Historical_Record);
    }
    /*** Getting list of the Player1_Historical_Record ***/
    public List<Player1_Historical_Record> findAllPlayer1_Historical_Record(){
        return player1_Historical_RecordRepository.findAll();
    }
    /*** Updating Player1_Historical_Record***/
    public Player1_Historical_Record updatePlayer1_Historical_Record(Player1_Historical_Record player1_Historical_Record){
        return player1_Historical_RecordRepository.save(player1_Historical_Record);
    }
    /*** Getting list of the Player1_Historical_Record by Id  ***/
    public Player1_Historical_Record findPlayer1_Historical_RecordById(Long id){
        return player1_Historical_RecordRepository.findPlayer1_Historical_RecordById(id)
                .orElseThrow(()-> new Player1_Historical_RecordNotFoundException( "Player1 By Id" + id + "Not Found"));
    }

    /*** Deleting Player1_Historical_Record***/
    public void deletePlayer1_Historical_Record( Long id){
        player1_Historical_RecordRepository.deletePlayer1_Historical_RecordById(id);
    }

}

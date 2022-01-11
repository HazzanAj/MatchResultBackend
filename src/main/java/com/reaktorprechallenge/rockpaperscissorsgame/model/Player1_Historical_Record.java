package com.reaktorprechallenge.rockpaperscissorsgame.model;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name="player1_historical_record")
public class Player1_Historical_Record implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable=false)
    private Long id;
    private String player1Name;
    private String player1NoOfMatches;
    private String player1Wins;
    private String player1Loss;
    private String player1WinRatio;
    private String player1MostPlayedHands;
    private String player1_Historical_RecordCode;
    @ManyToMany
    private List<GameInProgress> gameInProgress;
    public void setPlayer1_Historical_RecordCode(String player1_Historical_RecordCode) {
        this.player1_Historical_RecordCode = player1_Historical_RecordCode;
    }
}

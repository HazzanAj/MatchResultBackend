package com.reaktorprechallenge.rockpaperscissorsgame.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Data
@Entity
@Table(name="player2_historical_record")
public class Player2_Historical_Record implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable=false)
    private Long id;
    private String player2Name;
    private String player2NoOfMatches;
    private String player2Wins;
    private String player2Loss;
    private String player2WinRatio;
    private String player2MostPlayedHands;
    private String player2_Historical_RecordCode;
    @ManyToMany
    private List<GameInProgress> gameInProgress;
    public void setPlayer2_Historical_RecordCode(String player2_Historical_RecordCode) {
        this.player2_Historical_RecordCode = player2_Historical_RecordCode;
    }
}

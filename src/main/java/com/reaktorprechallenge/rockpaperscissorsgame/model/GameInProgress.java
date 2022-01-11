package com.reaktorprechallenge.rockpaperscissorsgame.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Data
@Entity
@Table(name="gameInProgress")
public class GameInProgress implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable=false)
private Long id;
private String gameStage;
private String player1Name;
private String player2Name;
private String player1Scores;
private String player2Scores;
private String leadingPlayer;
private String gameInProgressCode;

@ManyToMany(mappedBy = "gameInProgress")
private List<Player1_Historical_Record> player1_historical_record;
@ManyToMany(mappedBy = "gameInProgress")
private List<Player2_Historical_Record> player2_historical_record;

    public void setGameInProgressCode(String gameInProgressCode) {
        this.gameInProgressCode = gameInProgressCode;
    }
}

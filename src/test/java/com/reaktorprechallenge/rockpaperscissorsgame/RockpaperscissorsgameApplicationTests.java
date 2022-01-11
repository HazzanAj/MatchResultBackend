package com.reaktorprechallenge.rockpaperscissorsgame;

import com.reaktorprechallenge.rockpaperscissorsgame.controller.GameInProgressController;
import com.reaktorprechallenge.rockpaperscissorsgame.controller.Player1_Historical_RecordController;
import com.reaktorprechallenge.rockpaperscissorsgame.controller.Player2_Historical_RecordController;
import com.reaktorprechallenge.rockpaperscissorsgame.model.GameInProgress;
import com.reaktorprechallenge.rockpaperscissorsgame.model.Player1_Historical_Record;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class RockpaperscissorsgameApplicationTests {
    @Autowired
    private GameInProgressController gameInProgressController;
    @Autowired
    private Player1_Historical_RecordController player1_historical_recordController;
    @Autowired
    private Player2_Historical_RecordController player2_historical_recordController;
    @Test
    void contextLoads() {
        /** Performing AssertThat Testing **/
        assertThat(gameInProgressController).isNotNull ();
        assertThat(player1_historical_recordController).isNotNull ();
        assertThat(player2_historical_recordController).isNotNull ();
    }

}

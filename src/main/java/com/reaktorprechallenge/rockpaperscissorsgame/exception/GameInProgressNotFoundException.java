package com.reaktorprechallenge.rockpaperscissorsgame.exception;

public class GameInProgressNotFoundException extends RuntimeException {
    public GameInProgressNotFoundException( String message){
        super(message);
    }
}

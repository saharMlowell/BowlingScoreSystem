package com.score.bowling;

import com.score.bowling.frame.FrameFactory;

import java.util.ArrayList;

/**
 * Created by slowell on 12/3/16.
 */
public class GameInit {
    private ArrayList<Roll> arrRolls = new ArrayList<Roll>() ;
    Game game;
    GameInit(int[] arrPins){
        for(int pin :arrPins){
            if(pin!=-1){
                this.arrRolls.add(new Roll(pin));
            }
        }
        this.game = buildGame();
    }

    /**
     * Create a game with its frames
     *
     * @return
     */
    private Game buildGame(){

        return new Game(FrameFactory.getFrame(arrRolls));
    }

     int getScore(){
        return this.game.getScore();
    }
}

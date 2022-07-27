package com.scaler.lld.ttt.simulator;

import com.scaler.lld.ttt.modules.BotPlayer;
import com.scaler.lld.ttt.modules.HumanPlayer;
import com.scaler.lld.ttt.modules.Player;
import com.scaler.lld.ttt.modules.Symbol;
import com.scaler.lld.ttt.modules.enums.DifficultyLevel;
import com.scaler.lld.ttt.modules.enums.PlayerType;

public class GameSimulator {
    public static void main(String[] args) {
        Player humanPlayer1 = new HumanPlayer("Ariel", new Symbol('H'));
        Player botPlayer2 = new BotPlayer(DifficultyLevel.EASY, new Symbol('B'));


    }
}

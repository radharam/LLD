package com.scaler.lld.ttt.modules;

import com.scaler.lld.ttt.factories.strategyFactory.BotPlayingStrategyFactory;
import com.scaler.lld.ttt.modules.enums.DifficultyLevel;
import com.scaler.lld.ttt.modules.enums.PlayerType;
import com.scaler.lld.ttt.strategy.playingStrategy.BotPlayingStrategy;

public class BotPlayer extends Player {

    private DifficultyLevel difficultyLevel;
    BotPlayingStrategy botPlayingStrategy;

    public BotPlayer(DifficultyLevel difficultyLevel, Symbol symbol){
        super(symbol, PlayerType.BOT);
        this.difficultyLevel = difficultyLevel;

       this.botPlayingStrategy = new BotPlayingStrategyFactory().createBotPlayingStrategy(difficultyLevel);
    }

    @Override
    public Move makeMove(Board board) {
        return botPlayingStrategy.makeNextMove(board, this);
    }
}



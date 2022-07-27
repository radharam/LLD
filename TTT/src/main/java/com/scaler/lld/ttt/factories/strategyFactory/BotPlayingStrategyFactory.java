package com.scaler.lld.ttt.factories.strategyFactory;

import com.scaler.lld.ttt.strategy.playingStrategy.BotPlayingStrategy;
import com.scaler.lld.ttt.strategy.playingStrategy.RandomBotPlayingStrategy;
import com.scaler.lld.ttt.modules.enums.DifficultyLevel;

public class BotPlayingStrategyFactory {

    public BotPlayingStrategy createBotPlayingStrategy(DifficultyLevel difficultyLevel) {

        return switch (difficultyLevel) {
            case EASY, MEDIUM, HARD, UNDEFINED -> new RandomBotPlayingStrategy();
        };
    }
}

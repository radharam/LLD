package com.scaler.snakesandladders.models;

import com.scaler.snakesandladders.models.enums.GameStatusEnum;
import com.scaler.snakesandladders.strategy.HandleMoveStrategy;
import com.scaler.snakesandladders.strategy.UnlockButtonMoveStrategy;

import java.util.List;

public class Game {
    Board board;
    Dice dice;
    int totalButtonPlayer;
    int lastPlayerMovedIdx;
    GameStatusEnum gameStatus;
    List<Player> players;
    List<Player> ranking;

    HandleMoveStrategy moveStrategy;
    UnlockButtonMoveStrategy unlockButtonMoveStrategy;

}

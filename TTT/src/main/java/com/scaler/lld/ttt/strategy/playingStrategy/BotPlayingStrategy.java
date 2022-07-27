package com.scaler.lld.ttt.strategy.playingStrategy;

import com.scaler.lld.ttt.modules.Board;
import com.scaler.lld.ttt.modules.Move;
import com.scaler.lld.ttt.modules.Player;

public interface BotPlayingStrategy {
    public Move makeNextMove(Board board, Player player);
}

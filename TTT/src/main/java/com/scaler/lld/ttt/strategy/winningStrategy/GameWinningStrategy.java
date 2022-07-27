package com.scaler.lld.ttt.strategy.winningStrategy;

import com.scaler.lld.ttt.modules.Board;
import com.scaler.lld.ttt.modules.Cell;
import com.scaler.lld.ttt.modules.Player;

public interface GameWinningStrategy {

    boolean checkIfWon(Board board, Player player, Cell moveCell);

}

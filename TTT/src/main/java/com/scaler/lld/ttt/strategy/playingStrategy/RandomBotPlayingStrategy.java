package com.scaler.lld.ttt.strategy.playingStrategy;

import com.scaler.lld.ttt.modules.Board;
import com.scaler.lld.ttt.modules.Cell;
import com.scaler.lld.ttt.modules.Move;
import com.scaler.lld.ttt.modules.Player;

import java.util.List;

public class RandomBotPlayingStrategy implements BotPlayingStrategy{

    @Override
    public Move makeNextMove(Board board, Player player) {
        for(List<Cell> row:  board.getBoard()) {
            for(Cell cell: row) {
                if(cell.isEmpty()) {
                    Move move = new Move();
                    move.setPlayer(player);
                    move.setCell(cell);
                    move.setSymbol(player.getSymbol());
                    return move;
                }
            }
        }
        return null;
    }
}

package com.scaler.lld.ttt;

import com.scaler.lld.ttt.exceptions.EmptyMovesUndoOperationException;
import com.scaler.lld.ttt.exceptions.MultipleBotsException;
import com.scaler.lld.ttt.modules.Game;
import com.scaler.lld.ttt.modules.Player;
import com.scaler.lld.ttt.modules.enums.GameStatus;
import com.scaler.lld.ttt.strategy.winningStrategy.GameWinningStrategy;

import java.util.List;

public class GameController {
    public Game createGame(List<Player> playerList, List<GameWinningStrategy> winningStrategies, int dim) {
        try{
            return Game.create().setDimension(dim)
                                .addPlayers(playerList).addGameWinningStrategies(winningStrategies)
                                .build();
        } catch (MultipleBotsException e) {
            throw new RuntimeException("Try Again!!!");
        }
    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public GameStatus gameStatus(Game game) {
        return game.getGameStatus();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void undo(Game game) throws EmptyMovesUndoOperationException {
        game.undo();
    }

    public void display(Game game) {
        game.getBoard().printBoard();
    }
}

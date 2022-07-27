package com.scaler.lld.ttt.modules;

import com.scaler.lld.ttt.exceptions.EmptyMovesUndoOperationException;
import com.scaler.lld.ttt.exceptions.MultipleBotsException;
import com.scaler.lld.ttt.modules.enums.GameStatus;
import com.scaler.lld.ttt.modules.enums.PlayerType;
import com.scaler.lld.ttt.strategy.winningStrategy.GameWinningStrategy;


import java.util.ArrayList;
import java.util.List;

public class Game{

    private List<Player> playersList;
    private List<GameWinningStrategy> gameWinningStrategies;
    private List<Move> moves;
    private int lastPlayerIndexMove;
    private Board board;
    private Player winner;

    public List<Move> getMoves() {
        return moves;
    }

    public int getLastPlayerIndexMove() {
        return lastPlayerIndexMove;
    }

    public Board getBoard() {
        return board;
    }

    public Player getWinner() {
        return winner;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    private GameStatus gameStatus;


    public Game() {
        this.gameStatus = GameStatus.DRAW;
        this.lastPlayerIndexMove = -1;
        this.playersList = new ArrayList<>();
        this.gameWinningStrategies = new ArrayList<>();
        this.moves = new ArrayList<>();
    }

    public void makeMove() {
         /*
            1. incr last index
            2. get last player played at the curr index
            3. make move to that index
            4. add move to moves list
         */

        this.lastPlayerIndexMove ++;
        this.lastPlayerIndexMove %= playersList.size();
        Move move = this.playersList.get(this.lastPlayerIndexMove).makeMove(this.board);
        this.moves.add(move);
        move.getCell().setSymbol(move.getSymbol());
        for (GameWinningStrategy strategy: gameWinningStrategies) {
            if (strategy.checkIfWon(this.board, this.playersList.get(this.lastPlayerIndexMove), move.getCell())) {
                    gameStatus = GameStatus.ENDED;
                winner = this.playersList.get(this.lastPlayerIndexMove);
                return;
            }
        }

        if (moves.size() == this.board.getDimension() * this.board.getDimension()) {
            gameStatus = GameStatus.DRAW;
            return;
        }
    }

    public boolean undo() throws EmptyMovesUndoOperationException {
        // edge case
        if(this.moves.size() == 0) throw new EmptyMovesUndoOperationException();

        /*
            1. get last cell
            2. clear it
            3. decr index
            4. get last player played at the prev index
            5. remove move from list of moves
         */
        Move lastMove = this.moves.get(moves.size()-1);
        Cell currCell = lastMove.getCell();
        currCell.clearCell();
        this.lastPlayerIndexMove--;
        this.lastPlayerIndexMove = (this.lastPlayerIndexMove + this.playersList.size()) % this.playersList.size();
        this.moves.remove(lastMove);

        return true;
    }

    public static Builder create(){
        return new Builder();
    }

    public static class Builder {
        private List<Player> playerList;
        private List<GameWinningStrategy> gameWiningStrategies;
        private int dimension;

        Builder() {
            this.playerList = new ArrayList<>();
            this.gameWiningStrategies = new ArrayList<>();
        }

        public Builder addPlayer(Player player) {
            this.playerList.add(player);
            return this;
        }

        public Builder addPlayers(List<Player> players) {
            this.playerList.addAll(players);
            return this;
        }

        public Builder addGameWinningStrategy(GameWinningStrategy strategy) {
            this.gameWiningStrategies.add(strategy);
            return this;
        }

        public Builder addGameWinningStrategies(List<GameWinningStrategy> strategies) {
            this.gameWiningStrategies.addAll(strategies);
            return this;
        }

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        private boolean checkIfSingleBotMax() {
            int botMaxCount = 0;

            for(Player player: this.playerList) {
                if(player.getPlayerType().equals(PlayerType.BOT)) botMaxCount++;
            }

            return botMaxCount <= 1;
        }

        public Game build() throws MultipleBotsException {
            if(!checkIfSingleBotMax()) throw new MultipleBotsException();

            Game game = new Game();
            game.playersList.addAll(this.playerList);
            game.gameWinningStrategies.addAll((this.gameWiningStrategies));
            game.board = new Board(this.dimension);

            return game;
        }

    }
}

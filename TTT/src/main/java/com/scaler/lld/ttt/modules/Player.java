package com.scaler.lld.ttt.modules;


import com.scaler.lld.ttt.modules.enums.PlayerType;

public abstract class   Player {

    public Player(Symbol symbol, PlayerType playerType) {
        this.symbol = symbol;
        this.playerType = playerType;
    }

    private Symbol symbol;
    private String name;
    private PlayerType playerType;

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public abstract Move makeMove(Board board);



}

package com.scaler.lld.ttt.modules;

import com.scaler.lld.ttt.modules.enums.PlayerType;

import java.util.Scanner;

public class HumanPlayer extends Player{

    public HumanPlayer(String name, Symbol symbol) {
        super(symbol, PlayerType.HUMAN);
    }

    @Override
    public Move makeMove(Board board) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please provide row number between 1 to "+board.getDimension());
        int row = sc.nextInt();
        System.out.println("please provide col number between 1 to "+board.getDimension());
        int col = sc.nextInt();

        Move move = new Move();
        move.setCell(board.getCell(row-1, col-1));
        move.setPlayer(this);
        move.setSymbol(this.getSymbol());
        return move;
    }
}

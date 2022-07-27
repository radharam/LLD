package com.scaler.lld.ttt.modules;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Board {
    private int dimension;
    private List<List<Cell>> board;

    public int getDimension(){
        return this.dimension;
    }

    public Board(int dimension){

        for(int r = 0; r < dimension; r++) {
            board.add(new ArrayList<>());
            for(int c = 0; c < dimension; c++) {
                board.get(r).add(new Cell());
            }
        }
    }

    public List<List<Cell>> getBoard(){
        return this.board;
    }

    public Cell getCell(int r, int c) {
        return this.board.get(r).get(c);
    }

    public void printBoard() {
        for(List<Cell> row: this.board) {
            for(Cell cell: row) {
                System.out.println(Objects.isNull(cell) ? "| |" : "| "+ cell.getSymbol().getCharacter()+" |");
            }
        }
    }

}

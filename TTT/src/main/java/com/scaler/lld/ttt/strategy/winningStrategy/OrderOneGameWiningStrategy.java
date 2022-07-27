package com.scaler.lld.ttt.strategy.winningStrategy;

import com.scaler.lld.ttt.modules.Board;
import com.scaler.lld.ttt.modules.Cell;
import com.scaler.lld.ttt.modules.Player;
import com.scaler.lld.ttt.modules.Symbol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderOneGameWiningStrategy implements GameWinningStrategy {

    List<Map<Character, Integer>> row;
    List<Map<Character, Integer>> col;
    List<Map<Character, Integer>> leftDiag;
    List<Map<Character, Integer>> rightDiag;
    private void initialize(int size){
        row = new ArrayList<>();
        col = new ArrayList<>();
        leftDiag = new ArrayList<>();
        rightDiag = new ArrayList<>();

        for(int i = 0; i < size; i++) {
            row.add(new HashMap<>());
            col.add(new HashMap<>());
            leftDiag.add(new HashMap<>());
            rightDiag.add(new HashMap<>());
        }
    }

    @Override
    public boolean checkIfWon(Board board, Player player, Cell moveCell) {
        if(row == null) initialize(board.getDimension());

        int rowIdx = moveCell.getRow();
        int colIdx = moveCell.getCol();

        if(updateNChkCount(board, player, rowIdx, row)) return true;
        else if(updateNChkCount(board, player, colIdx, col)) return true;
        else if(rowIdx == colIdx && updateNChkCount(board, player, rowIdx, leftDiag)) return true;
        else if(rowIdx + colIdx == board.getDimension() && updateNChkCount(board, player, rowIdx + colIdx, rightDiag)) return true;

        return false;
    }

    private boolean updateNChkCount(Board board, Player player, int index, List<Map<Character, Integer>> symbolFreq) {
        if(!symbolFreq.get(index).containsKey(player.getSymbol().getCharacter())) {
            symbolFreq.get(index).put(player.getSymbol().getCharacter(), 0);
        }

        symbolFreq.get(index).put(player.getSymbol().getCharacter(), symbolFreq.get(index).get(player.getSymbol().getCharacter())+1);
        return symbolFreq.get(index).get(player.getSymbol().getCharacter()).equals(board.getDimension());
    }
}

package com.scaler.snakesandladders.strategy;

import com.scaler.snakesandladders.models.Board;
import com.scaler.snakesandladders.models.Button;

public interface HandleMoveStrategy {
    void move (Button button, int value, Board board);
}

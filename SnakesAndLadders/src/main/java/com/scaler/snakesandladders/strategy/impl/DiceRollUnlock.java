package com.scaler.snakesandladders.strategy.impl;

import com.scaler.snakesandladders.strategy.UnlockButtonMoveStrategy;

public class DiceRollUnlock implements UnlockButtonMoveStrategy {
    @Override
    public boolean canUnlock(int value) {
        return false;
    }
}

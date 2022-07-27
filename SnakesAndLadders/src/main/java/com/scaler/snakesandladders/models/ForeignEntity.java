package com.scaler.snakesandladders.models;

public class ForeignEntity {
    ForeignEntity type;
    int from;
    int to;

    public ForeignEntity(ForeignEntity type, int from, int to) {
        this.type = type;
        this.from = from;
        this.to = to;
    }
}

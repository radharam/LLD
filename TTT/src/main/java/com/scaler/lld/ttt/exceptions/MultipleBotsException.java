package com.scaler.lld.ttt.exceptions;

public class MultipleBotsException extends Exception{

    public MultipleBotsException() {
        super("A Game cannot have more than one BOT Player!!");
    }
}

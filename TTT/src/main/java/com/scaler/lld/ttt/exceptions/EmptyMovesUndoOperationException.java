package com.scaler.lld.ttt.exceptions;

public class EmptyMovesUndoOperationException extends Exception{

    public EmptyMovesUndoOperationException(){
        super("Undo operation was called when no move existed");
    }
}

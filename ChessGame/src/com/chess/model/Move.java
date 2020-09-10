package com.chess.model;

public class Move {
    public Move(Box startBox, Box endBox) {
        this.startBox = startBox;
        this.endBox = endBox;
    }

    public Box getStartBox() {
        return startBox;
    }

    public Box getEndBox() {
        return endBox;
    }

    private Box startBox;
    private Box endBox;
}

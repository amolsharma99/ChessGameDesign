package com.chess.model;


public abstract class Piece {

    private boolean killed = false;
    private boolean isWhite = false;

    public boolean isKilled() {
        return killed;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setKilled(boolean killed) {
        this.killed = killed;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

    public Piece(boolean isWhite){
        this.setWhite(isWhite);
    }

    public abstract boolean canMove(Board board, Box start, Box end);
    public abstract Box[] getValidMoves(Board board, Box pos);

}

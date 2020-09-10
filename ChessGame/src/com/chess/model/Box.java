package com.chess.model;

public class Box {

    private Piece piece;
    private int x;
    private int y;

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Piece getPiece() {
        return piece;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Box(int x, int y, Piece piece){
        this.setPiece(piece);
        this.setX(x);
        this.setY(y);
    }

}

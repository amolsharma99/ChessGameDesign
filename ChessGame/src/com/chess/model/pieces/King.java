package com.chess.model.pieces;

import com.chess.model.Board;
import com.chess.model.Box;
import com.chess.model.Piece;

public class King extends Piece {

    public boolean castlingDone = false;

    public void setCastlingDone(boolean castlingDone) {
        this.castlingDone = castlingDone;
    }

    public boolean isCastlingDone() {
        return castlingDone;
    }

    public King(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean canMove(Board board, Box start, Box end) {

        if(end.getPiece() != null && end.getPiece().isWhite() == this.isWhite())
            return false;

        int dx = Math.abs(start.getX() - end.getX());
        int dy = Math.abs(start.getX() - end.getY());
        if(dx > 1 || dy > 1)
            return false;

        if(!isBoxAttacked(board, end))
            return true;

        //Check for Castling.


        return false;
    }

    @Override
    public Box[] getValidMoves(Board board, Box pos) {
        return new Box[0];
    }

    public boolean isBoxAttacked(Board board, Box box){

        return false;
    }
}

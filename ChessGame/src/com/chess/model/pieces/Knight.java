package com.chess.model.pieces;

import com.chess.model.Board;
import com.chess.model.Box;
import com.chess.model.Piece;

public class Knight extends Piece {
    public Knight(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean canMove(Board board, Box start, Box end) {
        return false;
    }

    @Override
    public Box[] getValidMoves(Board board, Box pos) {
        return new Box[0];
    }
}

package com.chess.model;

import com.chess.model.pieces.*;

public class Board {

    private final int BOARD_SIZE = 8;

    Box[][] boxes;

    public Board(){
        this.resetBoard();
    }

    public Box getBox(int x, int y){
        if(x<0 || x >= BOARD_SIZE || y<0 || y>= BOARD_SIZE){
            throw new IndexOutOfBoundsException("Invalid Box Address");
        }
        return boxes[x][y];
    }

    public void resetBoard() {

        boxes = new Box[8][8];
        setupPiecesForColor(true);
        setupPiecesForColor(false);
        for(int i=2;i<6;i++){
            for(int j=0;j<8;j++){
                boxes[i][j] = new Box(i, j, null);
            }
        }
    }


    private void setupPiecesForColor(boolean isWhite){

        int idx = isWhite ? 0 : 7;

        boxes[idx][0] = new Box(idx, 0, new Rook(isWhite));
        boxes[idx][1] = new Box(idx, 1, new Knight(isWhite));
        boxes[idx][2] = new Box(idx, 2, new Bishop(isWhite));
        boxes[idx][3] = new Box(idx, 3, new Queen(isWhite));
        boxes[idx][4] = new Box(idx, 4, new King(isWhite));
        boxes[idx][5] = new Box(idx, 5, new Bishop(isWhite));
        boxes[idx][6] = new Box(idx, 6, new Knight(isWhite));
        boxes[idx][7] = new Box(idx, 7, new Rook(isWhite));


        if(isWhite)
            idx++;
        else
            idx--;


        for(int i=0;i<8;i++){
            boxes[1][idx] = new Box(idx, i, new Pawn(isWhite));
        }
    }

}

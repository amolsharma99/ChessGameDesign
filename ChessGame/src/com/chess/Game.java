package com.chess;

import com.chess.model.Board;
import com.chess.model.Box;
import com.chess.model.Move;
import com.chess.model.Player;

public class Game {

    private Board board;
    private Player[] players;
    private Player currentTurn;
    //    private List<Move> movesPlayed;

    public Player getCurrentTurn() {
        return currentTurn;
    }

    private GameStatus gameStatus;

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }


    public void initialize(Player p1, Player p2){
        //Throw exception is both are white or black.
        players = new Player[2];
        players[0] = p1;
        players[1] = p2;

        board = new Board();
        board.resetBoard();
        if( p1.isWhite()) {
            this.currentTurn = p1;
        }
        else{
            this.currentTurn = p2;
        }
        setGameStatus(GameStatus.ACTIVE);
    }

    public boolean playerMove(Player p, int startX, int startY, int endX, int endY){
        Box startBox = board.getBox(startX, startY);
        Box endBox = board.getBox(endX, endY);
        Move move = new Move(startBox, endBox);
        return this.makeMove(move, p);
    }

    private boolean makeMove(Move move, Player p){




        return true;
    }
}

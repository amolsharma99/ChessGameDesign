package com.chess.model;

public class Player {

    int id;

    public int getId() {
        return id;
    }

    public Player(int id, boolean isWhite){
        this.id = id;
        this.isWhite = true;
    }

    boolean isWhite;

    public boolean isWhite() {
        return isWhite;
    }

    public User getUser() {
        return user;
    }

    User user;
}

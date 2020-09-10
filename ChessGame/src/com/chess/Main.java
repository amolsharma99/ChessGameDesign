package com.chess;

import java.util.PriorityQueue;
import java.util.Scanner;
import com.chess.model.Player;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        System.out.println("Starting Chess Game");

        Scanner sc = new Scanner(System.in);
        Player p1 = new Player(1, true);
        Player p2 = new Player(2, false);

        Game game = new Game();
        game.initialize(p1, p2);

        while(game.getGameStatus().equals(GameStatus.ACTIVE)){
            Player p = game.getCurrentTurn();
            System.out.println(String.format("Current Turn for Player %d", p.getId()));
            int startX = sc.nextInt();
            int startY = sc.nextInt();
            int endX = sc.nextInt();
            int endY = sc.nextInt();
            game.playerMove(p, startX, startY, endX, endY);
            //If Invalid Move the player will be prompted again for the move.
        }

        System.out.println(String.format("Final Result - %s", game.getGameStatus().toString()));

        PriorityQueue<Integer> pq;


                Set<String> s;
                s.
                Sets.int

    }
}

package app;

import model.*;

public class Main   {

    public static void main(String[] args) {

        System.out.println("Hello world. I am a java program!");
        Board board = new Board();
        board.restart();
        board.mark(0,0); // P1
        board.mark(0,1);
        board.mark(1,1); // P1
        board.mark(0,2);
        board.mark(2,0); // P1
        System.out.println(board.getState());
    }

}

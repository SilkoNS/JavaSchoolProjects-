package src.cv2;

import java.util.Scanner;

abstract public class ChessGame {
    private final Scanner scanner = new Scanner(System.in);
    protected Chess chess;

    public void print() {
        System.out.println(chess);
    }

    public abstract void execute();

    private char toUpper(char c) {
        return (char) (c - 32);
    }

    protected char getChar() {
        char c;
        c = scanner.next().charAt(0);
        if (c > 90)
            c = toUpper(c);
        return c;
    }
}


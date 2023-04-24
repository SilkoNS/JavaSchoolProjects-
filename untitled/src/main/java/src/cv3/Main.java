package src.cv3;

import src.cv2.Chess;
import src.cv2.ChessGame;
import src.cv2.ChessGameRandom;

public class Main {
    public static void main(String[] args) {
        FunctionPrime fp = new FunctionPrime(2, 2);
        int x = 123;
        System.out.println(fp);
        System.out.println(fp.calcY(x));
        QuadraticFunction fq = new QuadraticFunction(2, 3, 5);
        System.out.println(fq);
        System.out.println(fq.squareCount());
        System.out.println(fq.getDiscriminant());
        System.out.println(fq.calcY(x));
        ChessGame cgr = ChessGameRandom.initChess(new Chess((byte) 10, (byte) 0, (byte) 0));
//        cgr.execute();
    }
}

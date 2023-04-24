package src.cv2;

import java.util.Random;

public class ChessGameRandom extends ChessGame {
    private final Random rnd = new Random();

    public static ChessGame initChess(Chess chess) {
        if (chess.test()) {
            return new ChessGameRandom(chess);
        } else {
            throw new RuntimeException();
        }
    }

    private ChessGameRandom(Chess chess) {
        this.chess = chess;
    }

    @Override
    public void execute() {
        int i = 0;
        do {
            print();
            var direction = Direction.values()[rnd.nextInt(4)];

            chess.move(direction);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i++ == 4) {
                System.out.println("Press any key to continue, Q to exit");
                char c = getChar();
                if (c == 'Q')
                    return;
                i = 0;
            }
        } while (i < 5);
    }
}

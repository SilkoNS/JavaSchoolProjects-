package src.cv2;

public class ChessGameManual extends ChessGame {

    public static ChessGame initChess(Chess chess) {
        if (chess.test()) {
            return new ChessGameManual(chess);
        } else {
            throw new RuntimeException();
        }
    }

    private ChessGameManual(Chess chess) {
        this.chess = chess;
    }

    @Override
    public void execute() {
        do {
            print();
            char c = getChar();

            if (c == 'K') {
                System.out.println("Opravdu opustit? Y\\N");
                c = getChar();
                if (c == 'Y')
                    return;
                else continue;
            }
            var direction = Direction.getDirection(c);
            if (direction == null) {
                System.out.println("Available directions A - LEFT, S - DOWN, D - RIGHT, W - UP\nK - Exit");
                continue;
            }

            chess.move(direction);

        } while (true);
    }
}

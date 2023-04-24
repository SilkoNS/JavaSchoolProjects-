package src.cv2;

public enum Direction {
    UP, DOWN, LEFT, RIGHT;

    public static Direction getDirection(char c) {
        switch (c) {
            case 'W':
                return UP;
            case 'D':
                return RIGHT;
            case 'A':
                return LEFT;
            case 'S':
                return DOWN;
        }
        return null;
    }


}

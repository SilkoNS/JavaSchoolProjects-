package src.cv2;

public class Chess {
    private final byte size;
    private byte actualX;
    private byte actualY;

    public Chess(byte size, byte actualX, byte actualY) {
        this.size = size;
        this.actualX = actualX;
        this.actualY = actualY;
    }

    public boolean test() {
        return size > 0 && actualX >= 0 && actualX < size && actualY >= 0 && actualY < size;
    }

    private boolean canLeft() {
        return actualX - 1 >= 0;
    }

    private boolean canRight() {
        return actualX + 1 < size;
    }

    private boolean canDown() {
        return actualY - 1 >= 0;
    }

    private boolean canUp() {
        return actualY + 1 < size;
    }

    private boolean canMove(Direction direction) {
        switch (direction) {
            case UP:
                return canUp();
            case DOWN:
                return canDown();
            case LEFT:
                return canLeft();
            case RIGHT:
                return canRight();
        }
        return false;
    }

    public boolean move(Direction direction) {
        if (!canMove(direction)) {
            System.out.println(direction.name() + " not available, border reached");
            return false;
        }
        switch (direction) {
            case UP:
                actualY++;
                break;
            case DOWN:
                actualY--;
                break;
            case LEFT:
                actualX--;
                break;
            case RIGHT:
                actualX++;
                break;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Chess{" +
                "size=" + size +
                ", actualX=" + actualX +
                ", actualY=" + actualY +
                '}';
    }

    @Override
    public Chess clone() {
        return new Chess(size, actualX, actualY);
    }
}

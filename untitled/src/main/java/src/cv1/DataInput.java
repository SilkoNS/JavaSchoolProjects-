package src.cv1;

import java.util.Scanner;

public class DataInput {
    private static final Scanner scanner = new Scanner(System.in);

    public static int readInt() {
        try {
            return scanner.nextInt();
        } catch (Exception ex) {
            throw new NumberFormatException("Not an integer value");
        }
    }

    public static byte readByte() {
        try {
            return scanner.nextByte();
        } catch (Exception ex) {
            throw new NumberFormatException("Not an byte value");
        }
    }

    public static short readShort() {
        try {
            return scanner.nextShort();
        } catch (Exception ex) {
            throw new NumberFormatException("Not an short value");
        }
    }

    public static long readLong() {
        try {
            return scanner.nextLong();
        } catch (Exception ex) {
            throw new NumberFormatException("Not an long value");
        }
    }

    public static float readFloat() {
        try {
            return scanner.nextFloat();
        } catch (Exception ex) {
            throw new NumberFormatException("Not an float value");
        }
    }

    public static double readDouble() {
        try {
            return scanner.nextDouble();
        } catch (Exception ex) {
            throw new NumberFormatException("Not an double value");
        }
    }

    public static char readChar() {
        try {
            var read = scanner.next();
            if (read.length() > 1)
                throw new Exception();
            return read.charAt(0);
        } catch (Exception ex) {
            throw new NumberFormatException("Not an char value");
        }
    }
}

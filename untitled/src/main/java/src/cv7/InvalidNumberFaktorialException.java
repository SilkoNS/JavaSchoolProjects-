package src.cv7;

/**
 *
 * @author musil19
 */
public class InvalidNumberFaktorialException extends Exception {
    public InvalidNumberFaktorialException() {
        super("Hodnota čísla je záporná.");
    }

    public InvalidNumberFaktorialException(String msg) {
        super(msg);
    }
}

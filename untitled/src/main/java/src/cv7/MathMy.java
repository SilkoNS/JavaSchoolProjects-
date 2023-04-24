package src.cv7;

/**
 *
 * @author musil19
 */
public class MathMy {
    public static long faktorial(int c) throws Exception {
        if (c < 0)
            throw new Exception("Nelze pocitat faktorial ze zaporne hodnoty cisla.");

        long f = 1;
        for (int i = 2; i <= c; i++)
            f *= i;

        return f;
    }

    public static long faktorial2(int c) throws InvalidNumberFaktorialException {
        if (c < 0)
            throw new InvalidNumberFaktorialException();

        long f = 1;
        for (int i = 2; i <= c; i++)
            f *= i;

        return f;
    }
}

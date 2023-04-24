package src.cv2;

public class Ascii {
    private final String codes = initCodes();

    private String initCodes() {
        var result = new StringBuilder();
        for (int i = 'A'; i <= 'Z'; i++) {
            result.append(i);
            result.append(" - ");
            result.append((char) i);
            result.append('\n');
        }
        return result.toString();
    }

    public String getCodes() {
        return codes;
    }

    void printCodes() {
        System.out.println(getCodes());
    }
}

package src.cv5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringCv {
    private final Scanner scanner = new Scanner(System.in);

    public String validate(String pattern) {
        System.out.print("Put line: ");
        var line = scanner.nextLine();
        if (!line.matches(pattern))
            throw new IllegalArgumentException();
        return line;
    }

    public int[] b() {
        return Arrays.stream(validate("^(\\d+;)*\\d+$").split(";")).mapToInt(Integer::parseInt).toArray();
    }

    public double[] c() {
        return Arrays.stream(validate("^(\\d+\\.\\d+;){2}\\d+\\.\\d+$").split(";")).mapToDouble(Double::parseDouble).toArray();
    }

    public int[] d() {
        System.out.print("Put line: ");
        var line = scanner.nextLine();
        System.out.print("Put symbol: ");
        var symbol = scanner.nextLine().charAt(0);
        var list = new ArrayList<Integer>();
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == symbol)
                list.add(i);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    public void e(){
        System.out.print("Put line: ");
        var line = scanner.nextLine();
        var s = line.trim().split("\\s+");
        var name = s[0];
        var surname = s[1];
        System.out.println(name);
        System.out.println(surname);
    }
}

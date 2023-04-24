package src.cv4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionMethods {
    private final Scanner scanner = new Scanner(System.in);
    private final HashSet<String> names = new HashSet<>();

    private boolean addName() {
        String name = scanner.nextLine();
        return names.add(name);
    }

    public void addName(int count) {
        for (int i = 0; i < count; i++) {
            if (!addName()) {
                System.out.println("This name already present");
                i--;
            }
        }
    }

    public void printAllCombinations() {
        names.forEach(s1 -> {
                    names.forEach(s2 -> {
                        if (!s1.equals(s2))
                            System.out.println("[" + s1 + ", " + s2 + "]");
                    });
                    System.out.println();
                }
        );
    }

    public void printArrayListAndSort() {
        System.out.println("Print list elements:");
        var namesList = new ArrayList<>(names);
        printArray(namesList);
        System.out.println("\n\nSorted list:");
        printArray(namesList.stream().sorted().collect(Collectors.toList()));
    }

    private void printArray(List<String> list) {
        forPrint(list);
//        foreachPrint(list);
//        iteratorPrint(list);
    }

    private void forPrint(List<String> list) {
        System.out.println("For print");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    private void foreachPrint(List<String> list) {
        System.out.println("\nForeach print");
        list.forEach(i -> System.out.print(i + " "));
    }

    private void iteratorPrint(List<String> list) {
        var it = list.iterator();
        System.out.println("\nIterator print");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }

    public void composeNames(int count) {
        var firstNames = new ArrayList<String>(count);
        var lastNames = new ArrayList<String>(count);
        for (int i = 0; i < count; i++) {
            firstNames.add(scanner.nextLine());
            lastNames.add(scanner.nextLine());
        }
        var third = IntStream.range(0, lastNames.size())
                .mapToObj(i -> firstNames.get(i) + " " + lastNames.get(i))
                .collect(Collectors.toList());
        third.forEach(System.out::println);
    }

    public void composeNamesArray(int count) {
        var firstNames = new String[count];
        var lastNames = new String[count];
        for (int i = 0; i < count; i++) {
            firstNames[i] = scanner.nextLine();
            lastNames[i] = scanner.nextLine();
        }
        var third = IntStream.range(0, lastNames.length)
                .mapToObj(i -> firstNames[i] + " " + lastNames[i])
                .collect(Collectors.toList());
        third.forEach(System.out::println);
    }

    public void mines(int minesCount) {
        var minesField = new Boolean[minesCount][minesCount];
        var random = new Random();
        for (int i = 0; i < minesField.length; i++) {
            for (int j = 0; j < minesField.length; j++) {
                minesField[i][j] = random.nextBoolean();
            }
        }
        printMines(minesField);
    }

    private void printMines(Boolean[][] minesField) {
        System.out.println("Mines field");
        for (Boolean[] i : minesField) {
            for (Boolean j : i) {
                System.out.print(j ? "* " : "- ");
            }
            System.out.println();
        }
    }
}

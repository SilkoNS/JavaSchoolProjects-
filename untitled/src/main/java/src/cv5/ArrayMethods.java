package src.cv5;

import src.cv3.Function;
import src.cv3.FunctionPrime;
import src.cv3.QuadraticFunction;

import java.util.ArrayList;

public class ArrayMethods {
    public void printObjects(ArrayList<Function> list) {
        list.forEach(System.out::println);
    }

    public void printQuadratic(ArrayList<Function> list) {
        list.forEach(i -> {
            if (i instanceof QuadraticFunction)
                System.out.println(i);
        });
    }

    public void printPrime(ArrayList<Function> list) {
        list.forEach(i -> {
            if (i instanceof FunctionPrime)
                System.out.println(i);
        });
    }

    public boolean addUnique(ArrayList<Function> list, Function item) {
        if (!list.contains(item)) {
            list.add(item);
            return true;
        }
        return false;
    }
}

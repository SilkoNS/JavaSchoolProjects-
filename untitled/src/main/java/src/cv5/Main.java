package src.cv5;

import src.cv3.Function;
import src.cv3.FunctionPrime;
import src.cv3.QuadraticFunction;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StringCv stringCv = new StringCv();
//        System.out.println(Arrays.toString(stringCv.b()));
//        System.out.println(Arrays.toString(stringCv.c()));
//        System.out.println(Arrays.toString(stringCv.d()));
//        stringCv.e();
        ArrayMethods arrayMethods = new ArrayMethods();
        var fList = new ArrayList<Function>();
        fList.add(new FunctionPrime(1,2));
        fList.add(new FunctionPrime(1,3));
        fList.add(new FunctionPrime(1,4));
        fList.add(new QuadraticFunction(1,2,3));
        fList.add(new QuadraticFunction(1,2,4));
        QuadraticFunction checkForDuplicity = new QuadraticFunction(1, 2, 5);
        fList.add(checkForDuplicity);
        arrayMethods.printObjects(fList);
        arrayMethods.printPrime(fList);
        arrayMethods.printQuadratic(fList);
        System.out.println(arrayMethods.addUnique(fList, checkForDuplicity));
    }
}

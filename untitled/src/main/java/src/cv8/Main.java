package src.cv8;

import java.io.IOException;
import java.io.Serializable;

public class Main {
    public static void main(String[] args) {
        IOFileTool io = new IOFileTool();
//        io.u2();//12bytes
        String filename = "C:\\Users\\Hende\\Downloads\\untitled\\src\\main\\java\\src\\cv8\\";
//        io.u3a(filename + "test.txt");
//        io.u3b(filename + "test.txt", filename + "testCopy.txt");
        Datum dob = new Datum(1, 2, 1999);
        Osoba osoba = new Osoba("name", "surname", 10, dob);
        io.serialize(osoba, filename+"osoba.txt");
        Osoba osoba2 = io.deserialize(filename + "osoba.txt");
        System.out.println(osoba2);
        io.serialize(dob, filename+"dob.txt");
        Datum dob2 = io.deserialize(filename+"dob.txt");
        System.out.println(dob2);
    }
}

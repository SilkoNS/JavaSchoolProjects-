package src.cv9;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\Hende\\Downloads\\untitled\\src\\main\\java\\src\\cv9\\";
        ThreadMethods threadMethods = new ThreadMethods();
//        threadMethods.u1();
        threadMethods.u2b(path + "Main.java", path + "DuplicityMain.txt", 100000);
        threadMethods.u2a(path + "DuplicityMain.txt", path + "DuplicityMainCopy.txt");
    }
}

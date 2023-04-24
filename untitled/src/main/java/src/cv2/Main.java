package src.cv2;

import src.cv1.DataInput;

public class Main {
    public static void main(String[] args) {
        byte min = 0;
        System.out.println(--min);
        byte max = 127;
        System.out.println(++max);
        int c = DataInput.readChar();
        System.out.println(c);
        cast();
        Ascii ascii = new Ascii();
        String codes = ascii.getCodes();
        ascii.printCodes();//System.out.println(codes);
        //Show chess class
    }

    static void cast(){
        Trojeuhelnik trojeuhelnik = new Trojeuhelnik(1, 2, 3);
        Object trojObj = trojeuhelnik;
        trojeuhelnik = (Trojeuhelnik) trojObj;
        System.out.println(trojeuhelnik);
    }
}

class Trojeuhelnik{
    private int a;
    private int b;
    private int c;

    public Trojeuhelnik(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

}
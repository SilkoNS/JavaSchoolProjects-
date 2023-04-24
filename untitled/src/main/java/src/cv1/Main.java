package src.cv1;

public class Main {
    public static void main(String[] args) {//sachy jsou v cv2
        deklaracePromennych();
        tiskCislo(55);
        DataInput.readInt();
    }

    static void deklaracePromennych(){
        int a = 1;
        byte b = 2;
        float c = 2f;
        double d = 2.0;
        char e = 'a';
        short f = 2;
        long g = 1;
        boolean h = false;
        Object i = new Object();
        System.out.println(i);
    }

    static void tiskCislo(int c){
        System.out.println(c);
        System.out.println(Integer.toHexString(c));
        System.out.println(Integer.toBinaryString(c));
        System.out.println(Integer.toOctalString(c));
    }

}

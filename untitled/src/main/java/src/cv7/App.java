package src.cv7;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(300, 200);
        f.setLayout(null);

        JTextField t1 = new JTextField("");
        t1.setBounds(20, 10, 100, 30);
        f.add(t1);

        JLabel l1 = new JLabel("");
        l1.setBounds(20, 90, 280, 30);
        f.add(l1);

        JButton b1 = new JButton("spocitej");
        b1.setBounds(20, 50, 100, 30);
        f.add(b1);

        b1.addActionListener(e -> {
            try {
                int cislo = Integer.parseInt(t1.getText());
                long faktorial = MathMy.faktorial2(cislo);
                l1.setText("" + cislo + '!' + " = " + faktorial);
            } catch (NumberFormatException nfEx) {
                System.out.println(nfEx.getMessage());
                l1.setText("Chybne zadane cislo");
            } catch (InvalidNumberFaktorialException infkEx) {
                System.out.println(infkEx.getMessage());
                l1.setText("Cislo musi byt vetsi nez 0");
            }
        });

        f.setVisible(true);
    }
}

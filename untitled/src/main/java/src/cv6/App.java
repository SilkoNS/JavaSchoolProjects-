package src.cv6;

import src.cv3.QuadraticFunction;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class App {
    public static void main(String[] args) {
        ukazkaKomponent();
        suma();
        kvadratickaRovnice();
        pochybTlacitka();
        pochybSipky();
    }

    public static void ukazkaKomponent() {
        JFrame f = new JFrame();
        f.setSize(400, 500);
        f.setLayout(null);

        JTextField t1 = new JTextField("input");
        t1.setBounds(20, 10, 100, 30);
        f.add(t1);

        JCheckBox c1 = new JCheckBox("checkbox");
        c1.setBounds(20, 50, 100, 30);
        f.add(c1);

        JRadioButton r1 = new JRadioButton("volba 1");
        r1.setBounds(20, 90, 100, 30);
        f.add(r1);

        JRadioButton r2 = new JRadioButton("volba 2");
        r2.setBounds(20, 130, 100, 30);
        f.add(r2);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        JButton b1 = new JButton("click");
        b1.setBounds(20, 170, 100, 30);
        f.add(b1);

        JLabel l1 = new JLabel("label");
        l1.setBounds(20, 200, 100, 30);
        f.add(l1);

        f.setVisible(true);
    }

    public static void suma() {
        JFrame f = new JFrame();
        f.setSize(400, 200);
        f.setLayout(null);

        JTextField t1 = new JTextField("");
        t1.setBounds(20, 10, 100, 30);
        f.add(t1);

        JTextField t2 = new JTextField("");
        t2.setBounds(140, 10, 100, 30);
        f.add(t2);

        JLabel l1 = new JLabel("");
        l1.setBounds(260, 10, 100, 30);
        f.add(l1);

        JButton b1 = new JButton("spocitej");
        b1.setBounds(120, 50, 100, 30);
        f.add(b1);

        b1.addActionListener(e -> {
            try {
                float vysl = Float.parseFloat(t1.getText()) + Float.parseFloat(t2.getText());
                l1.setText(Float.toString(vysl));
            } catch (Exception ex) {
                System.out.println(ex.getLocalizedMessage());
                l1.setText("chyba");
            }

        });

        f.setVisible(true);
    }

    public static void kvadratickaRovnice() {
        JFrame f = new JFrame();
        f.setSize(400, 200);
        f.setLayout(null);

        JTextField t1 = new JTextField("a");
        t1.setBounds(20, 10, 100, 30);
        f.add(t1);

        JTextField t2 = new JTextField("b");
        t2.setBounds(140, 10, 100, 30);
        f.add(t2);

        JTextField t3 = new JTextField("c");
        t3.setBounds(260, 10, 100, 30);
        f.add(t3);

        JLabel l1 = new JLabel("result");
        l1.setBounds(20, 50, 100, 30);
        f.add(l1);

        JButton b1 = new JButton("spocitej");
        b1.setBounds(200, 50, 100, 30);
        f.add(b1);

        b1.addActionListener(e -> {
            try {
                float a = Float.parseFloat(t1.getText());
                float b = Float.parseFloat(t2.getText());
                float c = Float.parseFloat(t3.getText());

                QuadraticFunction function = new QuadraticFunction(a, b, c);

                if (function.getDiscriminant() < 0) {
                    l1.setText("Nejsou reseni");
                    return;
                }

                double xx1 = function.getX1();
                double xx2 = function.getX2();

                l1.setText(xx1 + " " + xx2);
            } catch (Exception ex) {
                System.out.println(ex.getLocalizedMessage());
                l1.setText("chyba");
            }
        });

        f.setVisible(true);
    }

    private static Integer x1 = 0;

    private static Integer y1 = 0;

    public static void pochybTlacitka() {
        JFrame f = new JFrame();
        f.setSize(400, 500);
        f.setLayout(new GridLayout(5, 4));
        f.setTitle("x: " + x1 + " y: " + y1);

        var labels = new JLabel[16];

        for (int i = 0; i < labels.length; i++) {
            labels[i] = new JLabel(".");
            f.add(labels[i]);
        }

        labels[0].setText("X");

        JButton up = new JButton("^");
        up.addActionListener(e -> {
            labels[x1 + y1 * 4].setText(".");

            y1--;
            if (y1 < 0) {
                y1 = 3;
            }

            labels[x1 + y1 * 4].setText("X");
            f.setTitle("x: " + x1 + " y: " + y1);
        });
        f.add(up);

        JButton down = new JButton("v");
        down.addActionListener(e -> {
            labels[x1 + y1 * 4].setText(".");

            y1++;
            if (y1 > 3) {
                y1 = 0;
            }

            labels[x1 + y1 * 4].setText("X");
            f.setTitle("x: " + x1 + " y: " + y1);
        });
        f.add(down);

        JButton left = new JButton("<");
        left.addActionListener(e -> {
            labels[x1 + y1 * 4].setText(".");

            x1--;
            if (x1 < 0) {
                x1 = 3;
            }

            labels[x1 + y1 * 4].setText("X");
            f.setTitle("x: " + x1 + " y: " + y1);
        });
        f.add(left);

        JButton right = new JButton(">");
        right.addActionListener(e -> {
            labels[x1 + y1 * 4].setText(".");

            x1++;
            if (x1 > 3) {
                x1 = 0;
            }

            labels[x1 + y1 * 4].setText("X");
            f.setTitle("x: " + x1 + " y: " + y1);
        });
        f.add(right);

        f.setVisible(true);
    }

    private static Integer x2 = 0;

    private static Integer y2 = 0;

    public static void pochybSipky() {
        JFrame f = new JFrame();
        f.setSize(400, 500);
        f.setLayout(new GridLayout(4, 4));
        f.setTitle("x: " + x2 + " y: " + y2);

        var labels = new JLabel[16];

        for (int i = 0; i < labels.length; i++) {
            labels[i] = new JLabel(".");
            f.add(labels[i]);
        }

        labels[0].setText("X");

        f.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                labels[x2 + y2 * 4].setText(".");

                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        y2--;
                        break;
                    case KeyEvent.VK_DOWN:
                        y2++;
                        break;
                    case KeyEvent.VK_LEFT:
                        x2--;
                        break;
                    case KeyEvent.VK_RIGHT:
                        x2++;
                        break;
                }

                if (x2 < 0) {
                    x2 = 3;
                } else if (x2 > 3) {
                    x2 = 0;
                }

                if (y2 < 0) {
                    y2 = 3;
                } else if (y2 > 3) {
                    y2 = 0;
                }

                labels[x2 + y2 * 4].setText("X");
                f.setTitle("x: " + x2 + " y: " + y2);
            }
        });

        f.setVisible(true);
    }
}

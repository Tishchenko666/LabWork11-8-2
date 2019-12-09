package com.tish;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class GUI extends JFrame {

    public static void main(String[] args) {
        LinePainter linePainter = new LinePainter();
        GUI f = new GUI();

        f.add(linePainter);

    }

    GUI() {
        super("Arcobaleno");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 385);
        setVisible(true);

    }


    public static class LinePainter extends Canvas {
        LinePainter() {
            super();
        }

        public void paint(Graphics g) {
            for (int i = 0; i < 2; i++) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                g.setColor(Color.red);
                g.fillRect(0, 0, 500, 50);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                g.setColor(Color.orange);
                g.fillRect(0, 50, 500, 50);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                g.setColor(Color.yellow);
                g.fillRect(0, 100, 500, 50);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                g.setColor(Color.green);
                g.fillRect(0, 150, 500, 50);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                g.setColor(Color.cyan);
                g.fillRect(0, 200, 500, 50);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                g.setColor(Color.blue);
                g.fillRect(0, 250, 500, 50);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                g.setColor(Color.magenta);
                g.fillRect(0, 300, 500, 50);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                super.paint(g);
            }
        }
    }


}

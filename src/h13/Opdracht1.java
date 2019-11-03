package h13;

import java.awt.*;
import java.applet.*;

public class Opdracht1 extends Applet {

    public void init() {
        setSize(400, 400);
    }

    @Override
    public void paint(Graphics g) {

        int x1 = 90;
        int y1 = 90;
        int x2 = 100;
        int y2 = 50;
        int x3 = 80;
        int y3 = 80;

        tekenDriehoek(g, x1, y1, x2, y2, x3, y3);
    }

    void tekenDriehoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        g.setColor(Color.BLACK);
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x3, y3, x2, y2);
        g.drawLine(x3, y3,x1, y1);


    }
}


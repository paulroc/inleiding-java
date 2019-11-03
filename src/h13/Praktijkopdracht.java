package h13;

import java.awt.*;
import java.applet.*;

public class Praktijkopdracht extends Applet {

    @Override
    public void paint(Graphics g) {

        int x1 = 20;
        int y1 = 40;
        int width1 = 20;
        int height1 = 40;

        int x2 = 20;
        int y2 = 20;
        int width2 = 20;
        int height2 = 20;

        tekenBoom(g, x1, x2, y1, y2, width1, width2, height1, height2);
    }

    void tekenBoom(Graphics g, int x1, int x2, int y1, int y2, int width1, int width2, int height1, int height2) {
        for (int i = 0; i < 10; i++) {
            x1 = 40;
            x2 = 40;
            for (int j = 0; j < 20; j++) {
                g.setColor(Color.BLACK);
                g.fillRect(x1, y1, width1, height1);
                g.setColor(Color.GREEN);
                g.fillOval(x2, y2, width2, height2);
                x1 += width1 *2;
                x2 += width2 *2;
            }

            y1 += height1 *2;
            y2 += height2 *2;
        }
    }
}


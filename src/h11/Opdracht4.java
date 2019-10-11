package h11;

import java.awt.*;
import java.applet.*;

public class Opdracht4 extends Applet {


    public void paint(Graphics g) {

        int tafel = 3;
        int x = 50;
        int y = 70;

        for (int i = 1; i <= 10; i++) {
            g.drawString(i + " X " + tafel + " = " + (i * tafel), x, y);
            y += 20;

        }

    }


}

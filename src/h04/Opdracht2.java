package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(110, 90, 100, 10);
        g.drawLine(90, 90, 100, 10);
        g.drawLine(110, 90, 90, 90);
        g.drawRect(60, 90 , 100, 80);
        g.drawRect(90, 100, 10, 10);
        g.drawRect(100, 150, 10, 20);
    }
}

package h02;

import java.applet.Applet;
import java.awt.*;

public class Paulh2 extends Applet {

    @Override
    public void init() {
        setBackground(Color.blue);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Paul is klaar toch?", 99, 99);

    }
}

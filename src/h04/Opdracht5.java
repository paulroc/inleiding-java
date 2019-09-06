package h04;
import java.awt.*;
import java.applet.*;

public class Opdracht5 extends Applet{

    public void init() {
}

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(500, 100, 1000, 50, 0, 360);
    }
}
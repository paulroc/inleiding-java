package h04;
import java.awt.*;
import java.applet.*;

public class Opdracht7 extends Applet {
    public void init() {
}
    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.fillRoundRect(20, 20, 50, 50, 10, 10);
        g.setColor(Color.green);
        g.fillOval(20, 20, 10, 10);
        g.setColor(Color.green);
        g.fillOval(60, 20, 10, 10);
        g.setColor(Color.green);
        g.fillOval(20, 60, 10, 10);
        g.setColor(Color.green);
        g.fillOval(60, 60, 10, 10);

    }
}
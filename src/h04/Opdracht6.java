package h04;
import java.awt.*;
import java.applet.*;

public class Opdracht6 extends Applet {
    public void init() {
}
    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.fillRect(20, 50, 80, 100);
        g.setColor(Color.gray);
        g.fillRect(20, 150, 70, 125);
        g.setColor(Color.red);
        g.fillOval(50, 60, 10, 10);
        g.setColor(Color.orange);
        g.fillOval(50, 70, 10, 10);
        g.setColor(Color.green);
        g.fillOval(50, 80, 10, 10);




    }
}
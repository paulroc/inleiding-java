package h04;
import java.awt.*;
import java.applet.*;

public class Opdracht4 extends Applet {
    public void init() {
}
    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.red);
        g.drawString("Valerie",120,210);
        g.setColor(Color.green);
        g.drawString("Jeroen",160,210);
        g.setColor(Color.blue);
        g.drawString("Hans",200,210);
        g.setColor(Color.red);
        g.fillRect(150, 160, 10, 40);
        g.setColor(Color.green);
        g.fillRect(160, 100, 10, 100);
        g.setColor(Color.blue);
        g.fillRect(170, 120, 10, 80);
    }
}
package h04;
import java.awt.*;
import java.applet.*;


public class Opdracht3 extends Applet  {
    public void init() {
    }

        public void paint(Graphics g) {


            setBackground(Color.green);
            g.setColor(Color.red);
            g.fillRect(20, 80, 10, 10);
            g.setColor(Color.white);
            g.fillRect(20, 90, 10, 10);
            g.setColor(Color.blue);
            g.fillRect(20, 100, 10, 10);
            g.setColor(Color.black);
            g.fillRect(30, 90, 10, 270);

    }
}

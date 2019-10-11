package h11;
import java.awt.*;
import java.applet.*;

public class Opdracht1 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller = 0;
        int x = 0;

        while(teller < 11) {
            x += 20;
            g.drawLine(x , 50, x, 300 );
            g.drawString("" + teller, x, 305 );
            teller++;
        }
    }
}
package h11;
import java.awt.*;
import java.applet.*;

public class Opdracht8 extends Applet {

    public void init() {
        setSize(400, 400);
    }

    public void paint(Graphics g) {




        int x = 200;
        int y = 200;
        int width = 20;
        int height = 20;
        int teller = 0;

        while (teller <100) {
            g.drawOval(x, y, width, height);
            x-=10;
            y-=10;
            width+=20;
            height+=20;
            teller++;
        }
    }
}
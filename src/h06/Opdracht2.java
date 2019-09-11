package h06;
import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {
    int minuut;
    int uur;
    int dag;
    int jaar;



    public void init() {
        minuut = 60;
        uur = minuut * 60;
        dag = uur * 24;
        jaar = dag * 365;
    }

    public void paint(Graphics g) {
        g.drawString("Een uur heeft : " + uur + " seconden", 20, 20);
        g.drawString("Een dag heeft: " + dag + " seconden", 20, 40);
        g.drawString("Een jaar heeft: " + jaar + " seconden", 20, 60);
    }
}

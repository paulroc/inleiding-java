package h06;
import java.awt.*;
import java.applet.*;
public class Opdracht1 extends Applet {
    int a, b, c;
    double uitkomst;


    public void init() {
        a = 113;
        b = 4;
        uitkomst = (double) a / b;
    }

    public void paint(Graphics g) {
        g.drawString("Jan: " + uitkomst, 20, 20);
        g.drawString("Ali: " + uitkomst, 20, 40);
        g.drawString("Jeannette: " + uitkomst, 20, 60);
        g.drawString("ik: " + uitkomst, 20, 80);
    }
}


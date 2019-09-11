package h06;
import java.awt.*;
import java.applet.*;

public class Opdracht3 extends Applet {
    int a, b, c;
    double uitkomst;


    public void init() {
        a = 2147483647 ;
        b = 1;
        uitkomst = a + b ;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}


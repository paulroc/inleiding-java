package h06;
import java.awt.*;
import java.applet.*;
public class Praktijkopdracht extends Applet {
    double a;
    double b;
    double c;
    double d;
    double uitkomst;

    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 3;
        uitkomst = (a + b + c) / d;
        uitkomst *=  10;
        uitkomst = (int) uitkomst;
        uitkomst = uitkomst / 10;
}
    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);


    }
}
package h11;
import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        int y = 0;


        for (int teller=20; teller>9; teller--) {


            y+=20;
            g.drawString(teller+ "",50,y);


        }


    }
}




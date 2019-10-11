package h11;
import java.awt.*;
import java.applet.*;

public class Opdracht5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {


        setSize(400, 400);

        int x = 0;
        int y = 0;
        int teller = 0;

        while (teller <5)

        {
            y += 40;
            x += 40;


            g.drawRect(x, y, 40, 40);

            teller++;

        }


    }
}

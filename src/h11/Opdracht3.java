package h11;
import java.awt.*;
import java.applet.*;

public class Opdracht3 extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        int y = 0;

        int voorbeeld1 = 0;
        int voorbeeld2 = 1;
        int som= voorbeeld1 +voorbeeld2;
        for (int teller=0; teller<20; teller++) {


            y+=20;
            g.drawString(som+"",50,y);

            voorbeeld1=voorbeeld2;
            voorbeeld2=som;
            som=voorbeeld1+voorbeeld2;
        }


                    }
                }





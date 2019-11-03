package h12;

import java.awt.*;
import java.applet.*;
import java.util.*;

public class Opdracht1 extends Applet {

    double[] getallen={1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
    double gemiddelde;


    public void init() {

      gemiddelde=0;
      double som=0;
        for (int i = 0; i < getallen.length; i++) {
            som+=getallen[i];
        }
        gemiddelde=som/getallen.length;
    }


    public void paint(Graphics g) {
        setSize(400, 400);
g.drawString("getallen",50,20);
for (int teller=0;teller<getallen.length;teller++){
    g.drawString(""+getallen[teller],150,20*teller+20);
        }
g.drawString("gemidelde"+ gemiddelde,50,250);
    }
}


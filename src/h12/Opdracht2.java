package h12;
import java.awt.*;
import java.applet.*;
import java.util.*;
public class Opdracht2 extends Applet {

    Button knop;


    public void init() {
    }

        public void paint (Graphics g){
            //Loop

            for (int teller = 0; teller < 25; teller++) {
                //Knoppen

                knop = new Button("knop");
                add(knop);

                g.drawString("" + knop, 60, 50);

            }
        }
    }


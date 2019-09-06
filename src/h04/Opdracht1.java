package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht1  extends Applet{


        public void init() {
        }

        public void paint(Graphics g) {
            setBackground(Color.white);
            g.setColor(Color.black);
            g.drawLine(90, 90, 100, 50);
            g.drawLine(80, 80, 100, 50);
            g.drawLine(80, 80, 90, 90);
        }
    }

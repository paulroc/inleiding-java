package h02;

import javax.swing.*;
import java.awt.*;
import java.applet.*;

public class Opdracht22 extends Applet {
    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Paul", 50, 60 );

            g.setColor(Color.red);
            g.drawString("van Breda", 50, 70 );
    }
}

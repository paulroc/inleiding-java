package h11;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pratijkopdracht2 extends Applet {
    // GLOBAAL
    int tafel = 1;
    boolean firstnumber;
    String sorry;
    Button knopOK;

    public void init() {
        setSize(400, 400);
        knopOK = new Button("OK");
        knopOK.addActionListener(new knopOKListener());
        add(knopOK);

        firstnumber = true;
        sorry = " ";
tafel=1;
    }

    public void paint(Graphics g) {



        int x = 50;
        int y = 70;

        for (int i = 1; i <= 10; i++) {
            g.drawString(i + " X " + tafel + " = " + (i * tafel), x, y);
            y += 20;


        }
    }

    class knopOKListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            tafel += 1;
            repaint();
        }

    }


}


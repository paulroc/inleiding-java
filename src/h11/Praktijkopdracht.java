package h11;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {
    // GLOBAAL
    TextField tekstvlak;
    boolean firstnumber;
    int userInput;
    String sorry;
    Button knopOK;
    int tafel;

    public void init() {
        setSize(400, 400);
        tekstvlak = new TextField(20);
        add(tekstvlak);
        knopOK = new Button("OK");
        knopOK.addActionListener(new knopOKListener());
        add(knopOK);

        firstnumber = true;
        sorry = " ";

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
            String d  = tekstvlak .getText();
           tafel = Integer.parseInt(d);
                repaint();
        }

    }


}

package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht6 extends Applet implements ActionListener {

    private TextField tekstvak;
    private boolean isGevonden;
    private boolean isGeklikt;
    private int aantalGevonden;
    private int[] getallen = {6, 6, 8, 8, 17, 17, 17, 35, 35, 35};

    @Override
    public void init() {
        tekstvak = new TextField(10);
        add(tekstvak);

        Button knop = new Button("OK");
        knop.addActionListener(this);
        add(knop);

        isGevonden = false;
    }


    @Override
    public void paint(Graphics g) {
        if (isGeklikt) {
            if (isGevonden) {
                g.drawString("De waarde komt " + aantalGevonden + " voor in de tabel", 50, 80);
            } else {
                g.drawString("De waarde is niet gevonden", 50, 80);
            }
        }
    }


    public void actionPerformed(ActionEvent e) {
        aantalGevonden = 0;
        isGevonden = false;
        int input = Integer.parseInt(tekstvak.getText());
        isGeklikt = true;


        for (int i = 0; i < getallen.length; i++) {
            if (getallen[i] == input) {
                isGevonden = true;
                aantalGevonden++;


            }
        }
        repaint();


    }


}

package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht4 extends Applet implements ActionListener {

    private TextField tekstvak;
    private boolean isGevonden;
    private boolean isGeklikt;
    private int index;

    private int[] getallen = {4, 6, 8, 5, 55, 60};

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
                g.drawString("De waarde is gevonden op index" + index, 50, 80);
            } else {
                g.drawString("De waarde is niet gevonden", 50, 80);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        isGevonden = false;
        int input = Integer.parseInt(tekstvak.getText());
        isGeklikt = true;


        for (int i = 0; i < getallen.length; i++) {
            if (getallen[i] == input) {
                isGevonden = true;
                index = i;
            }
        }
        repaint();


    }


}

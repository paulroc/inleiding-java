package h12;

import java.awt.*;
import java.applet.*;
import java.lang.reflect.Array;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Praktijkopdracht extends Applet {
    // GLOBAAL
    Button knopOK;
    private int[] telefoonnummers = {36550967, 46878249, 18580908, 16226320, 49787535, 83808221, 12530515, 39414072, 13958324, 39576243};
    private boolean isGevonden;
    private boolean isGeklikt;
    TextField tekstvak;
    private int index;
    String message;

    @Override
    public void init() {
        knopOK = new Button("OK");
        knopOK.addActionListener(new knopOKListener());
        add(knopOK);

        Arrays.sort(telefoonnummers);

        tekstvak = new TextField(10);
        add(tekstvak);
        isGevonden = false;
        message = "Er is nog niets getypt.";
    }

    @Override
    public void paint(Graphics g) {

        if (isGeklikt) {
            if (isGevonden) {
                g.drawString("dit telefoonnummer hoort bij" + index, 50, 80);
            } else {
                g.drawString("dit is niet een telfoonnummer die je kunt in typen", 50, 80);
            }
        }
    }

    class knopOKListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {


            message = tekstvak.getText();
            repaint();

            isGevonden = false;
            int input = Integer.parseInt(tekstvak.getText());
            isGeklikt = true;


            for (int i = 0; i < telefoonnummers.length; i++) {
                if (telefoonnummers[i] == input) {
                    isGevonden = true;
                    index = i;
                }
            }
            repaint();
        }
    }
}




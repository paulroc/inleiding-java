package h12;

import java.awt.*;
import java.applet.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet {

    // GLOBAAL
    TextField[] tekstvakken;
    Button knopOK;


    public void init() {
        setSize(600, 400);
        tekstvakken = new TextField[5];
        //Loop

        for (int teller = 0; teller < 5; teller++) {
            //Tekstvakken

            TextField tekstvak = new TextField(10);
            add(tekstvak);
            tekstvakken[teller] = tekstvak;

        }


        knopOK = new Button("OK");
        knopOK.addActionListener(new knopOKListener());
        add(knopOK);

    }



    public void paint(Graphics g) {



    }


    class knopOKListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            int[] nummers = new int[5];
            for (int i=0; i < tekstvakken.length; i++){
                String in= tekstvakken[i].getText();
                int input= Integer.parseInt(in);
                nummers[i] = input;
            }

            Arrays.sort(nummers);
            for (int i=0;i<tekstvakken.length;i++){
                tekstvakken[i].setText(" " +nummers[i]);
            }

            repaint();

        }
    }
}


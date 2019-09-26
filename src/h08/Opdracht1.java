package h08;
import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1 extends Applet {

    // GLOBAAL
    TextField tekstvlak;
    Button knopOK;
    Button knopReset;
    String message;

    public void init() {

        setSize(400,400);

        tekstvlak = new TextField(20);
        add(tekstvlak);

        knopOK = new Button("OK");
        knopOK.addActionListener(new knopOKListener());
        add(knopOK);

        knopReset= new Button("Reset");
        add(knopReset);
        knopReset.addActionListener(new knopResetListener());

        message = "Er is nog niets getypt.";
    }
    public void paint(Graphics g) {
         g.drawString( message,20,50);
    }
    class knopOKListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
          message = tekstvlak.getText();
          repaint();
        }
    }
    class knopResetListener implements ActionListener{


        public void actionPerformed(ActionEvent e) {
            tekstvlak.setText(" ");
        }
    }


}

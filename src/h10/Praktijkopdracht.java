package h10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Praktijkopdracht extends Applet {
    int cijfer;
    TextField tekstvak;
    Label label;
    String tekst;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new VakListener());
        tekst = "";

        label = new Label("typ uw cijfer in.");

        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 45);
    }

    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;

            s = tekstvak.getText();
            cijfer = Integer.parseInt(s);
            if (cijfer > 10) {
                tekst = "dit cijfer is fout in getypt";
                repaint();}
               else{
                if (cijfer == 2) {
                        tekst = "slecht";
                        repaint();
                    }
                    if (cijfer == 4) {
                        tekst = "onvoldoende";
                        repaint();
                    }
                    if (cijfer == 5) {
                        tekst = "matig";
                        repaint();
                    }
                    if (cijfer == 8) {
                        tekst = "goed";
                        repaint();
                    }
                    if (cijfer == 6) {
                        tekst = "voldoede";
                        repaint();
                    }
                    if (cijfer == 7) {
                        tekst = "voldoende";
                        repaint();
                    }
                    if (cijfer == 1) {
                        tekst = "onvoldoende";
                        repaint();
                    }
                    if (cijfer == 10) {
                        tekst = "goed";
                        repaint();
                    }
                    if (cijfer == 9) {
                        tekst = "goed";
                        repaint();
                    }
                    if (cijfer == 3) {
                        tekst = "onvoldoende";
                        repaint();

                    }
                }
            }
        }
    }


package h08;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Opdracht3 extends Applet {
    // GLOBAAL
    TextField tekstvlak;
    Button knopOK;
    String message1;
    String message2;
    double getal1;
    double getal2;
    double getal3;

    double bedragInclusiefBTW;

    double uitkomst;

    public void init() {

        setSize(400, 400);

        tekstvlak = new TextField(15);
        add(tekstvlak);

        knopOK = new Button("OK");
        knopOK.addActionListener(new KnopOkListener());
        add(knopOK);

        message1 = "bedrag met btw.";
        message2= "Voer een bedrag in";
    }

    public void paint(Graphics g) {
        g.drawString("Bedrag incl BTW: " + bedragInclusiefBTW, 50, 80 );
    }

    class KnopOkListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String s = tekstvlak.getText();
            double input = Double.parseDouble(s) ;
            bedragInclusiefBTW = input * 1.21;
            repaint();

        }
    }

}





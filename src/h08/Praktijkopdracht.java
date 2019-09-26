package h08;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Praktijkopdracht extends Applet {
    // GLOBAAL
    TextField tekstvlak1;
    TextField tekstvlak2;
    Button knopPlus;
    Button knopMin;
    Button knopKeer;
    Button knopDelen;
    String message;
    int Plus;
    int Min;
    int Keer;
    int Delen;
    double bedragInclusiefBTW;

    double uitkomst;

    public void init() {

        setSize(600, 400);

        tekstvlak1 = new TextField(20);
        add(tekstvlak1);
        tekstvlak2 = new TextField(20);
        add(tekstvlak2);

        knopPlus = new Button("+");
        knopPlus.addActionListener(new KnopPlusListener());
        add(knopPlus);

        knopMin = new Button("-");
        knopMin.addActionListener(new KnopMinListener());
        add(knopMin);

        knopKeer = new Button("*");
        knopKeer.addActionListener(new KnopKeerListener());
        add(knopKeer);

        knopDelen = new Button("/");
        knopDelen.addActionListener(new KnopDelenListener());
        add(knopDelen);
    }

    @Override
    public void paint(Graphics g) {
//        tekstvlak1.setLocation(20,20);
//        tekstvlak2.setLocation(20,40);
        g.drawString(uitkomst + "", 50, 100);

    }


    class KnopPlusListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            String s = tekstvlak1.getText();
            double input1 = Double.parseDouble(s);
            String d = tekstvlak2.getText();
            double input2 = Double.parseDouble(d);
            uitkomst = input1 + input2;
            repaint();
        }
    }

    class KnopMinListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = tekstvlak1.getText();
            double input1 = Double.parseDouble(s);
            String d = tekstvlak2.getText();
           double input2 = Double.parseDouble(d);
           uitkomst = input1 - input2;
            repaint();


        }
    }

    class KnopKeerListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = tekstvlak1.getText();
            double input1 = Double.parseDouble(s);
            String d = tekstvlak2.getText();
            double input2 = Double.parseDouble(d);
            uitkomst = input1 * input2;
            repaint();


        }
    }

    class KnopDelenListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = tekstvlak1.getText();
            double input1 = Double.parseDouble(s);
            String d = tekstvlak2.getText();
           double input2 = Double.parseDouble(d);
           uitkomst = input1 / input2;
            repaint();


        }
    }
}






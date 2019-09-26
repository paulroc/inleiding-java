package h08;
import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Opdracht2 extends Applet {
    // GLOBAAL
    TextField tekstvlak;
    Button knopMan;
    Button knopVrouw;
    Button knopJonge;
    Button knopMeisje;
    String message;
    int mannen;
    int vrouwen;
    int jongens;
    int meisjes;

    public void init() {

        setSize(400,400);

        tekstvlak = new TextField(20);
        add(tekstvlak);

        knopMan = new Button("Man");
        knopMan.addActionListener(new knopManListener());
        add(knopMan);


        knopVrouw= new Button("Vrouw");
        add(knopVrouw);
        knopVrouw.addActionListener(new knopVrouwListener());


        knopJonge = new Button("Jonge");
        knopJonge.addActionListener(new knopJongeListener());
        add(knopJonge);


        knopMeisje= new Button("Meisje");
        add(knopMeisje);
        knopMeisje.addActionListener(new knopMeisjeListener());


}
    public void paint(Graphics g) {
        g.drawString( "Aantal mannen: " + mannen, 20,50);
        g.drawString(  "Aantal vrouwen" + vrouwen,20,70);
        g.drawString(  "Aantal Jongens" + jongens,20,90);
        g.drawString(  "Aantal meisjes" + meisjes,20,110);
        g.drawString("Totaal" + (mannen + vrouwen + jongens + meisjes),20,130);
    }
    class knopManListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            mannen++;
            repaint();
        }
    }
    class knopVrouwListener implements ActionListener{


        public void actionPerformed(ActionEvent e) {
            vrouwen++;
        }
    }
    class knopJongeListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
             jongens++;
            repaint();
        }
    }
    class knopMeisjeListener implements ActionListener{


        public void actionPerformed(ActionEvent e) {
            meisjes++;
        }
    }


}

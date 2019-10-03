package h10;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextListener;
import java.awt.TextField;
public class Opdracht4 extends Applet {

    TextField tv;
    TextField tekstvak;
    boolean firstnuber;
    int userInput;
    String sorry;
    String d, tekst;
    Button knopOK;
    int jaartal;
    Label label;
    int maand;

    public void init() {
        tv = new TextField(10);
        tv.addActionListener(new Tekstlistener());
        tekstvak= new TextField(10);
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(tv);
        add(tekstvak);
        knopOK = new Button("OK");

        knopOK.addActionListener(new Tekstlistener());
        add(knopOK);
        knopOK.addActionListener(new TekstvakListener());
        add(knopOK);
        firstnuber = true;
        sorry = " ";

    }

    @Override
    public void paint(Graphics g) {
        g.drawString("jaar", 190, 50);
        g.drawString("maand",90,50);
        g.drawString(sorry, 50, 120);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            d = tekstvak.getText();
            jaartal = Integer.parseInt(d);
            if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0) {
                tekst = "" + jaartal + " is een schrikkeljaar, dus februari heeft dus 29 dagen";
            } else {
                tekst = "" + jaartal + " is geen schrikkeljaar, dus februari heeft dus 28 dagen";
            }
            repaint();
        }
    }
    class Tekstlistener implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            String s = tv.getText();
            userInput = Integer.parseInt(s);
            if (userInput == 1){
                sorry="Januari 31 dagen";
                repaint();}
            else {
                if (userInput==2){
                    sorry="Februari 28 of 29 dagen";
                    repaint();}
                if (userInput==3){
                    sorry="Maart 31 dagen";
                    repaint();}
                if (userInput==4){
                    sorry="April 30 dagen";
                    repaint();}
                if (userInput==5){
                    sorry="Mei 31 dagen";
                    repaint();}
                if (userInput==6){
                    sorry="Juni 30 dagen";
                    repaint();}
                if (userInput==7){
                    sorry="Juli 31 dagen";
                    repaint();}
                if (userInput==8){
                    sorry="Augutus 31 dagen";
                    repaint();}
                if (userInput==9){
                    sorry="September 30 dagen";
                    repaint();}
                if (userInput==10){
                    sorry="Oktober 31 dagen";
                    repaint();}
                if (userInput==11){
                    sorry="November 30 dagen";
                    repaint();}
                if (userInput==12){
                    sorry="December 31 dagen";
                    repaint();}
                if (userInput >12 ) {
                    sorry = "Sorry, maar" + userInput + "is niet een maand nummer";
                    repaint();}
            }
        }
    }
}

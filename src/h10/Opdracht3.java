package h10;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextListener;

public class Opdracht3 extends Applet {

    TextField tv;
    boolean firstnuber;
    int userInput;
    String sorry;
    Button knopOK;

    public void init() {
        tv = new TextField(20);
        tv.addActionListener(new Tekstlistener());
        add(tv);
        knopOK = new Button("OK");

        knopOK.addActionListener(new Tekstlistener());
        add(knopOK);

        firstnuber = true;
        sorry = " ";

    }

    @Override
    public void paint(Graphics g) {
        g.drawString("vul een maand in", 50, 100);
        g.drawString(sorry, 50, 120);
    }

    class Tekstlistener implements ActionListener {

        @Override
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

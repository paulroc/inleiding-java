package h10;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextListener;

public class Opdracht2 extends Applet {

    TextField tv;
    boolean firstnuber;
    int maxInput;
    int minInput;
    int userInput;
    String sorry;

    public void init() {
        tv = new TextField(20);
        tv.addActionListener(new Tekstlistener());
        add(tv);
        maxInput = 0;
        minInput = 0;
        firstnuber = true;
        sorry = " ";

    }

    @Override
    public void paint(Graphics g) {
        g.drawString("max Input" + maxInput, 50, 100);
        g.drawString("min Input" + minInput, 50, 120);
        g.drawString(sorry, 50, 130);
    }

    class Tekstlistener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String s = tv.getText();
            userInput = Integer.parseInt(s);
            if (firstnuber) {
                firstnuber = false;
                maxInput = userInput;
                minInput = userInput;
                repaint();
            } else {
                if (userInput > maxInput) {
                    maxInput = userInput;
                    sorry = "";
                } else if (userInput < minInput) {
                    minInput = userInput;
                    sorry = "";
                } else {
                    sorry = "Sorry, maar" + userInput + " is niet hoger dan " + maxInput + " en niet lager dan " + minInput;
                    repaint();
                }
            }
        }
    }
}
package h04;
import java.awt.*;
import java.applet.*;
public class Praktijkopdracht extends Applet {

    public void init() {
}
    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawString("Lijn",10,30);
        g.drawString("Rechthoek",10,80);
        g.drawString("Gevulde rechthoek met ovaal",100,80);
        g.drawString("Taartpunt met ovaal eromheen", 300,80);
        g.drawString("Afgeronde rechthoek",10,150);
        g.drawString("Gevulde ovaal",140,150);
        g.drawString("Cirkel",230,150);
        g.drawLine(10,10,100,10);
        g.drawRect(10,50,70,20);
        g.setColor(Color.magenta);
        g.fillRect(140,50,80,20);
        g.setColor(Color.black);
        g.drawArc(140, 50, 80, 20, 0, 360);
        g.drawArc(320, 50, 80, 20, 0, 360);
        g.setColor(Color.magenta);
        g.fillArc(320, 50, 80, 20, 0, 45);
        g.setColor(Color.black);
        g.drawRoundRect(10, 110, 80, 20, 10, 10);
        g.setColor(Color.magenta);
        g.fillOval(140,110,80,20);
        g.setColor(Color.black);
        g.drawOval(230,110,30,30);
    }
}
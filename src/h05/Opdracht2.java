package h05;
import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {
    //declaraie
    Color opvulkleur1;
    Color opvulkleur2;
    Color opvulkleur3;
    Color lijnkleur;
    int breedte;
    int hoogte1;
    int hoogte2;
    int hoogte3;


    public void init() {
        //initialisatie.
        opvulkleur1 = Color.RED;
        opvulkleur2 = Color.GREEN;
        opvulkleur3 = Color.BLUE;
        lijnkleur = Color.BLACK;
        breedte = 100;
        hoogte1 = 40;
        hoogte2 = 100;
        hoogte3 = 80;
}
    public void paint(Graphics g) {
        //Valerie
        g.setColor(opvulkleur1);
        g.fillRect(20,160,breedte,hoogte1);
        //Jeroen
        g.setColor(opvulkleur2);
        g.fillRect(130,100,breedte,hoogte2);
        //Hans
        g.setColor(opvulkleur3);
        g.fillRect(240,120,breedte,hoogte3);
       g.setColor(lijnkleur);
        g.drawString("Valerie",20,210);
        g.drawString("Jeroen",160,210);
        g.drawString("Hans",300,210);

    }
}

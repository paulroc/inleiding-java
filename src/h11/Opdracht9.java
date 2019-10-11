package h11;

import java.awt.*;
import java.applet.*;

public class Opdracht9 extends Applet {

    public void init() {
        setSize(500, 500);
    }

    public void paint(Graphics g) {
        int x = 0;
        int y = 0;
        int breedte = 50;
        int hoogte = 50;

        y = 50;
        x = 50;
        for (int kolom = 0; kolom < 8; kolom++) {
            g.drawRect(x, y, breedte, hoogte);


            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }

        y = 100;
        x = 100;
        for (int kolom = 0; kolom < 8; kolom++) {
            g.drawRect(x, y, breedte, hoogte);


            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }

        y = 150;
        x = 50;
        for (int kolom = 0; kolom < 8; kolom++) {
            g.drawRect(x, y, breedte, hoogte);


            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }

        y = 200;
        x = 100;
        for (int kolom = 0; kolom < 8; kolom++) {
            g.drawRect(x, y, breedte, hoogte);


            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }

        y = 250;
        x = 50;
        for (int kolom = 0; kolom < 8; kolom++) {
            g.drawRect(x, y, breedte, hoogte);


            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
        y = 300;
        x = 100;
        for (int kolom = 0; kolom < 8; kolom++) {
            g.drawRect(x, y, breedte, hoogte);


            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
        y = 350;
        x = 50;
        for (int kolom = 0; kolom < 8; kolom++) {
            g.drawRect(x, y, breedte, hoogte);


            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
        y = 400;
        x = 100;
        for (int kolom = 0; kolom < 8; kolom++) {
            g.drawRect(x, y, breedte, hoogte);


            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;


        }
    }
}




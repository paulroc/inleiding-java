package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet {
    // GLOBAAL

    Button baksteen;
    Button betonblok;

    @Override
    public void init() {

        baksteen = new Button("baksteen");
        baksteen.addActionListener(new baksteenListener());
        add(baksteen);

        betonblok = new Button("betonblok");
        add(betonblok);
        betonblok.addActionListener(new betonblokListener());
    }

    @Override
    public void paint(Graphics g) {

        int x1 = 20;
        int y1 = 20;
        int width1 = 40;
        int height1 = 20;

        int x2 = 20;
        int y2 = 20;
        int width2 = 50;
        int height2 = 20;

        tekenMuur(g, x1, x2, y1, y2, width1, width2, height1, height2);
    }

    void tekenMuur(Graphics g, int x1, int x2, int y1, int y2, int width1, int width2, int height1, int height2) {
        for (int i = 0; i < 10; i++) {
            x1 = 20;
            x2 = 20;
            for (int j = 0; j < 20; j++) {
                g.setColor(Color.red);
                g.fillRect(x1, y1, width1, height1);
                g.setColor(Color.black);
                g.drawRect(x1, y1, width1, height1);
                g.setColor(Color.gray);
                g.fillRect(x2, y2, width2, height2);
                g.setColor(Color.black);
                g.drawRect(x2, y2, width2, height2);
                x1 += width1;
                x2 += width2;
            }

            y1 += height1;
            y2 += height2;
        }
        class baksteenListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                g.setColor(Color.red);
                g.fillRect(x1, y1, width1, height1);
                g.setColor(Color.black);
                g.drawRect(x1, y1, width1, height1);
                repaint();
            }
        }
        class betonblokListener implements ActionListener {


            public void actionPerformed(ActionEvent e) {
                g.setColor(Color.gray);
                g.fillRect(x2, y2, width2, height2);
                g.setColor(Color.black);
                g.drawRect(x2, y2, width2, height2);
                repaint();
            }
        }

    }
}


package h12;

import java.awt.*;
import java.applet.*;

public class Opdracht5 extends Applet {


    public void main(String[] args) {
        double[] salaris = {100.0, 200.0, 500.0, 400.0, 300.0};
        double maximum = 0;
        for (int i = 0; i < salaris.length; i++) {
            maximum += salaris[i];
            if (maximum > 125.0) {
                System.out.println("125.00 exceeded...breaking out of loop");
                break;
            }
        }
    }

    public void paint(Graphics g) {
        g.drawString("Total order amount: %.12f%n  " , 50, 20);
        g.drawString("125.00 exceeded...breaking out of loop " , 50, 50);
    }
}




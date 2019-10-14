package challance;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Wereldtijden extends Applet {

    TextField tv;
    boolean firstnuber;
    int userInput;
    String sorry;
    String Londen;
    String Tokyo;
    String NewYork;
    String Sydney;
    Button knopOK;

    public void init() {
        tv = new TextField(20);
        tv.addActionListener(new Tekstlistener());
        add(tv);
        knopOK = new Button("OK");

        knopOK.addActionListener(new Tekstlistener());
        add(knopOK);

        firstnuber = true;
        Londen = " ";
        NewYork= " ";
        Tokyo= " ";
        Sydney= " ";
        sorry=" ";

    }

    @Override
    public void paint(Graphics g) {
        g.drawString("vul een uur in", 50, 100);
        g.drawString(sorry, 50, 200);
        g.drawString(Londen,50,120);
        g.drawString(NewYork,50,140);
        g.drawString(Tokyo,50,160);
        g.drawString(Sydney,50,180);
    }

    class Tekstlistener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String s = tv.getText();
            userInput = Integer.parseInt(s);
            if (userInput == 1){
                Londen="tijd in londen is 00:00 uur";
                Tokyo="tijd in Tokyo is 08:00 uur";
                NewYork="tijd in New York is 19:00 uur";
                Sydney="tijd in Sidney is 10:00 uur";
                sorry=" ";
                repaint();}
            else {
                if (userInput==2){
                    Londen="tijd in londen is 01:00 uur";
                    Tokyo="tijd in Tokyo is 09:00 uur";
                    NewYork="tijd in New York is 20:00 uur";
                    Sydney="tijd in Sidney is 11:00 uur";
                    sorry=" ";
                    repaint();}
                if (userInput==3){
                    Londen="tijd in londen is 02:00 uur";
                    Tokyo="tijd in Tokyo is 10:00 uur";
                    NewYork="tijd in New York is 21:00 uur";
                    Sydney="tijd in Sidney is 12:00 uur";
                    sorry=" ";
                    repaint();}
                if (userInput==4){
                    Londen="tijd in londen is 03:00 uur";
                    Tokyo="tijd in Tokyo is 11:00 uur";
                    NewYork="tijd in New York is 22:00 uur";
                    Sydney="tijd in Sidney is 13:00 uur";
                    sorry=" ";
                    repaint();}
                if (userInput==5){
                    Londen="tijd in londen is 04:00 uur";
                    Tokyo="tijd in Tokyo is 12:00 uur";
                    NewYork="tijd in New York is 23:00 uur";
                    Sydney="tijd in Sidney is 14:00 uur";
                    sorry=" ";
                    repaint();}
                if (userInput==6){
                    Londen="tijd in londen is 05:00 uur";
                    Tokyo="tijd in Tokyo is 13:00 uur";
                    NewYork="tijd in New York is 00:00 uur";
                    Sydney="tijd in Sidney is 15:00 uur";
                    sorry=" ";
                    repaint();}
                if (userInput==7){
                    Londen="tijd in londen is 06:00 uur";
                    Tokyo="tijd in Tokyo is 14:00 uur";
                    NewYork="tijd in New York is 01:00 uur";
                    Sydney="tijd in Sidney is 16:00 uur";
                    sorry=" ";
                    repaint();}
                if (userInput==8){
                    Londen="tijd in londen is 07:00 uur";
                    Tokyo="tijd in Tokyo is 15:00 uur";
                    NewYork="tijd in New York is 02:00 uur";
                    Sydney="tijd in Sidney is 17:00 uur";
                    sorry=" ";
                    repaint();}
                if (userInput==9){
                    Londen="tijd in londen is 08:00 uur";
                    Tokyo="tijd in Tokyo is 16:00 uur";
                    NewYork="tijd in New York is 03:00 uur";
                    Sydney="tijd in Sidney is 18:00 uur";
                    sorry=" ";
                    repaint();}
                if (userInput==10){
                    Londen="tijd in londen is 09:00 uur";
                    Tokyo="tijd in Tokyo is 17:00 uur";
                    NewYork="tijd in New York is 04:00 uur";
                    Sydney="tijd in Sidney is 19:00 uur";
                    sorry=" ";
                    repaint();}
                if (userInput==11){
                    Londen="tijd in londen is 10:00 uur";
                    Tokyo="tijd in Tokyo is 18:00 uur";
                    NewYork="tijd in New York is 05:00 uur";
                    Sydney="tijd in Sidney is 20:00 uur";
                    sorry=" ";
                    repaint();}
                if (userInput==12){
                    Londen="tijd in londen is 11:00 uur";
                    Tokyo="tijd in Tokyo is 19:00 uur";
                    NewYork="tijd in New York is 06:00 uur";
                    Sydney="tijd in Sidney is 21:00 uur";
                    sorry=" ";
                    repaint();}
                if (userInput==13){
                    Londen="tijd in londen is 12:00 uur";
                    Tokyo="tijd in Tokyo is 20:00 uur";
                    NewYork="tijd in New York is 07:00 uur";
                    Sydney="tijd in Sidney is 22:00 uur";
                    sorry=" ";
                    repaint();}
                if (userInput==14){
                    Londen="tijd in londen is 13:00 uur";
                    Tokyo="tijd in Tokyo is 21:00 uur";
                    NewYork="tijd in New York is 08:00 uur";
                    Sydney="tijd in Sidney is 23:00 uur";
                    sorry=" ";
                    repaint();}
                if (userInput==15){
                    Londen="tijd in londen is 14:00 uur";
                    Tokyo="tijd in Tokyo is 22:00 uur";
                    NewYork="tijd in New York is 09:00 uur";
                    Sydney="tijd in Sidney is 00:00 uur";
                    sorry=" ";
                    repaint();}
                if (userInput==16){
                    Londen="tijd in londen is 15:00 uur";
                    Tokyo="tijd in Tokyo is 23:00 uur";
                    NewYork="tijd in New York is 10:00 uur";
                    Sydney="tijd in Sidney is 01:00 uur";
                    sorry=" ";
                    repaint();}
                if (userInput==17){
                    Londen="tijd in londen is 16:00 uur";
                    Tokyo="tijd in Tokyo is 24:00 uur";
                    NewYork="tijd in New York is 11:00 uur";
                    Sydney="tijd in Sidney is 02:00 uur";
                    sorry=" ";
                    repaint();}
                if (userInput==18){
                    Londen="tijd in londen is 16:00 uur";
                    Tokyo="tijd in Tokyo is 00:00 uur";
                    NewYork="tijd in New York is 12:00 uur";
                    Sydney="tijd in Sidney is 03:00 uur";
                    sorry=" ";
                    repaint();}
                if (userInput==19){
                    Londen="tijd in londen is 17:00 uur";
                    Tokyo="tijd in Tokyo is 01:00 uur";
                    NewYork="tijd in New York is 13:00 uur";
                    Sydney="tijd in Sidney is 04:00 uur";
                    sorry=" ";
                    repaint();}
                if (userInput==20){
                    Londen="tijd in londen is 18:00 uur";
                    Tokyo="tijd in Tokyo is 02:00 uur";
                    NewYork="tijd in New York is 14:00 uur";
                    Sydney="tijd in Sidney is 05:00 uur";
                    sorry=" ";
                    repaint();}
                if (userInput==21){
                    Londen="tijd in londen is 19:00 uur";
                    Tokyo="tijd in Tokyo is 03:00 uur";
                    NewYork="tijd in New York is 15:00 uur";
                    Sydney="tijd in Sidney is 06:00 uur";
                    sorry=" ";
                    repaint();}
                if (userInput==22){
                    Londen="tijd in londen is 20:00 uur";
                    Tokyo="tijd in Tokyo is 04:00 uur";
                    NewYork="tijd in New York is 16:00 uur";
                    Sydney="tijd in Sidney is 07:00 uur";
                    sorry=" ";
                    repaint();}
                if (userInput==23){
                    Londen="tijd in londen is 21:00 uur";
                    Tokyo="tijd in Tokyo is 05:00 uur";
                    NewYork="tijd in New York is 17:00 uur";
                    Sydney="tijd in Sidney is 08:00 uur";
                    sorry=" ";
                    repaint();}
                if (userInput==24){
                    Londen="tijd in londen is 22:00 uur";
                    Tokyo="tijd in Tokyo is 06:00 uur";
                    NewYork="tijd in New York is 18:00 uur";
                    Sydney="tijd in Sidney is 09:00 uur";
                    sorry=" ";
                    repaint();}
                if (userInput==0){
                    Londen="tijd in londen is 22:00 uur";
                    Tokyo="tijd in Tokyo is 06:00 uur";
                    NewYork="tijd in New York is 18:00 uur";
                    Sydney="tijd in Sidney is 09:00 uur";
                    sorry=" ";
                    repaint();}
                if (userInput >24 ) {
                    sorry = "Sorry, maar" + userInput + "is geen uur";
                    repaint();}
            }
        }
    }
}

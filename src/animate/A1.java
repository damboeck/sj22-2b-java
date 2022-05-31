package animate;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Date;

public class A1 extends Animation {


    public A1(String title, int width, int height) {
        super(title, width, height);
        setVisible(true);
    }

    public static void main(String[] args) {
        new A1("Linie",600,600);
    }

    @Override
    public void paint(Graphics g) {
        Date date = new Date();
        double alpha = date.getSeconds()*6*Math.PI/180.;
        g.drawLine(300,
                   300,
                      (int)(300+Math.sin(alpha)*280),
                      (int)(300-Math.cos(alpha)*280));
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }
}

package animate;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class Ballspiel extends Animation {

    private Ball ball;
    private long t;    // Systemzeit in ms

    public Ballspiel(String title, int width, int height) {
        super(title, width, height);
        ball = new Ball(new Vect2D(200,200),new Vect2D(0.5,-0.1),50,Color.red);
        t = System.currentTimeMillis();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Ballspiel("Ballspiel",800,600);
    }

    @Override
    public void paint(Graphics g) {
        long takt = System.currentTimeMillis();
        long dT = takt - t;
        t = takt;
        Vect2D a = new Vect2D(0,0.0005);
        ball.calcTime(dT,a);
        ball.wallX(0);
        ball.wallX(this.getWidth());
        ball.wallY(25);
        ball.wallY(this.getHeight());
        ball.paint(g);
    }

    /**
     * Invoked when a key has been pressed.
     * See the class description for {@link KeyEvent} for a definition of
     * a key pressed event.
     *
     * @param e
     */
    @Override
    public void keyPressed(KeyEvent e) {

    }

    /**
     * Invoked when a mouse button has been pressed on a component.
     *
     * @param e
     */
    @Override
    public void mousePressed(MouseEvent e) {

    }
}

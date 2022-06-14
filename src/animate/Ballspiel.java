package animate;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class Ballspiel extends Animation {

    public Ballspiel(String title, int width, int height) {
        super(title, width, height);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Ballspiel("Ballspiel",800,600);
    }

    @Override
    public void paint(Graphics g) {

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

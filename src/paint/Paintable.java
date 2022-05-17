package paint;

import java.awt.*;

/** Elemente welche in einem Fenster darstellbar sind */
public interface Paintable {

    /** Zeichnet das Element in eine Graphics-Fenster */
    void paint(Graphics g);

}

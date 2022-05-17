package paint;

import java.awt.*;
import java.util.Vector;

public interface DrawingPanel {

    /** Liefert alle Elemente welche in der Zeichnung vorkommen */
    Vector<Paintable> getElements();

    /** Liefert die aktuelle Zeichenfarbe */
    Color getActualDrawingColor();
}

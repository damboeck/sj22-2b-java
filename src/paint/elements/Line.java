package paint.elements;

import java.awt.*;

public class Line extends Element2P {
    public Line(Point point, Color color) {
        super(point, color);
    }

    public Line(Point p1, Point p2, Color color) {
        super(p1, p2, color);
    }

    /**
     * Zeichnet das Element in eine Graphics-Fenster
     *
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        g.drawLine(p1.x,p1.y,p2.x,p2.y);
    }

    /**
     * Prüft ob der Punkt point direkt auf dem Objekt liegt
     *
     * @param point Punkt
     * @return true wenn Element selektiert
     */
    @Override
    public boolean isSelected(Point point) {
        return false;
    }

    /**
     * Misst den Abstand eines Punkte von einem Element
     *
     * @param point Punkt
     * @return Abstand des Punktes vom Element
     */
    @Override
    public double distanceTo(Point point) {
        return 0;
    }
}

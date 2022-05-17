package paint.tools;

import paint.DrawingPanel;
import paint.Editable;
import paint.Paintable;
import paint.elements.Line;

import java.awt.*;
import java.awt.event.MouseEvent;

public class ToolLine extends BaseTool implements Editable {

    private Point position;

    private boolean editmode;

    /** aktuell im Editmode selektierte Linie */
    private Line line=null;

    public ToolLine(Point position) {
        this.position = position;
        this.editmode = false;
    }

    /**
     * Zeichnet das Element in eine Graphics-Fenster
     *
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.lightGray);
        g.fillRect(position.x,position.y,40,40);
        g.setColor(Color.black);
        g.drawLine(position.x+4, position.y+4, position.x+36, position.y+36 );
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

    @Override
    public Paintable mouseReleased(MouseEvent e, DrawingPanel panel) {
        if (editmode) {
            line.setP2(e.getPoint());
            editmode=false;
            line=null;
        }
        return null;
    }

    @Override
    public Paintable mousePressed(MouseEvent e, DrawingPanel panel) {
        if (e.getButton()==MouseEvent.BUTTON1) {
            editmode=true;
            line = new Line(e.getPoint(),panel.getActualDrawingColor());
            panel.getElements().add(line);
            return line;
        }
        return null;
    }

    @Override
    public Paintable mouseDragged(MouseEvent e, DrawingPanel panel) {
        if (editmode) {
            line.setP2(e.getPoint());
        }
        return null;
    }

    @Override
    public Paintable mouseMoved(MouseEvent e, DrawingPanel panel) {
        if (e.getButton()==MouseEvent.BUTTON1 && editmode) {
            editmode=false;
            Paintable element = new Line(e.getPoint(),panel.getActualDrawingColor());
            panel.getElements().add(element);
            return element;
        }
        return null;
    }
}

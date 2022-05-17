package paint;


import paint.tools.BaseTool;
import paint.tools.ToolLine;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Vector;

public class Minipaint extends Fenster implements DrawingPanel {

    /* -----------------------------------------------------------------------
              Eigenschaften
       ----------------------------------------------------------------------- */
    /** Alle Buttons, Menüelemente welche nicht zur Zeichnung gehören */
    Vector<BaseTool> tools;

    /** aktuell selektiertes Werkzeug */
    BaseTool selectedTool;

    /** Alle gezeichneten Elemente */
    Vector<Paintable> elements;

    /** aktuell selektiertes Element */
    Paintable selectedElement;

    /* -----------------------------------------------------------------------
              Constructor - Main
       ----------------------------------------------------------------------- */
    public Minipaint() {
        super("Minipaint", 800,600);
        // initialize menu
        tools = new Vector<>();
        selectedTool = new ToolLine(new Point(60,60));
        tools.add(selectedTool);
        selectedElement = null;
        // initialize drawing
        elements = new Vector<>();

        setVisible(true);
    }

    public static void main(String[] args) {
        new Minipaint();
    }

    /* -----------------------------------------------------------------------
              Methoden
       ----------------------------------------------------------------------- */
    public Color getActualDrawingColor() {
        return Color.black;
    }

    public Vector<Paintable> getElements() {
        return this.elements;
    }

    @Override
    public void paint(Graphics g) {
        for (Paintable element:elements) element.paint(g);
        for (BaseTool tool:tools) tool.paint(g);
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

    @Override
    public void mousePressed(MouseEvent e) {
        if (selectedTool instanceof Editable) {
            selectedElement = ((Editable)selectedTool).mousePressed(e,this);
        }
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (selectedTool instanceof Editable) {
            selectedElement = ((Editable)selectedTool).mouseReleased(e,this);
        }
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (selectedTool instanceof Editable) {
            selectedElement = ((Editable)selectedTool).mouseDragged(e,this);
        }
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if (selectedTool instanceof Editable) {
            selectedElement = ((Editable)selectedTool).mouseMoved(e,this);
        }
        repaint();
    }
}

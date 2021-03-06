package paint.elements;

import paint.Paintable;
import paint.Selectable;

import java.awt.*;

public abstract class Element2P implements Paintable, Selectable {

    protected Point p1;
    protected Point p2;
    protected Color color;

    public Element2P(Point point, Color color) {
        this(point,point,color);
    }

    public Element2P(Point p1, Point p2, Color color) {
        this.p1 = p1;
        this.p2 = p2;
        this.color = color;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

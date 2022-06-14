package animate;

import paint.Paintable;

import java.awt.*;

public class Ball implements Paintable, Animateable {

    private Vect2D p,palt,v,valt;
    private double size;
    private Color  color;

    public Ball(Vect2D p, Vect2D v, double size, Color color) {
        this.p    = p;
        this.palt = p;
        this.v    = v;
        this.valt = v;
        this.size = size;
        this.color= color;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillOval((int)(p.x-size/2),(int)(p.y-size/2),(int)size,(int)size);
    }

    @Override
    public void calcTime(double dT, Vect2D a) {
        palt = p;
        valt = v;
        p = palt.add(valt.mul(dT)); // palt+valt*dT
        v = valt.add(a.mul(dT));
    }

    @Override
    public void wallX(double x) {
        if (v.x>0 && (p.x+size/2)>x && (palt.x+size/2)<=x ) {
            v = new Vect2D(-valt.x,v.y);
            p = new Vect2D(2*x-p.x-size/2,p.y);
        } else if (v.x<0 && (p.x-size/2)<x && (palt.x-size/2)>=x) {
            v = new Vect2D(-valt.x,v.y);
            p = new Vect2D(2*x-p.x+size/2,p.y);
        }
    }

    @Override
    public void wallY(double y) {
        if (v.y>0 && (p.y+size/2)>y && (palt.y+size/2)<=y ) {
            v = new Vect2D(v.x,-valt.y);
            p = new Vect2D(p.x,2*y-p.y-size/2);
        } else if (v.y<0 && (p.y-size/2)<y && (palt.y-size/2)>=y) {
            v = new Vect2D(v.x,-valt.y);
            p = new Vect2D(p.x,2*y-p.y+size/2);
        }
    }

}

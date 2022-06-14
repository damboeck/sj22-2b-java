package animate;

/** Vektor im zweidimensionalen Raum <br>
 *  Vektoren sind immutable */
public class Vect2D {
    /** X-Koordinate */
    public final double x;
    /** Y-Koordinate */
    public final double y;
    public Vect2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Vect2D add(Vect2D v) {
       return new Vect2D(x+v.x, y+v.y);
    }
    public Vect2D neg() {
        return new Vect2D(-x,-y);
    }
    public Vect2D sub(Vect2D v) {
        return add(v.neg());
    }
    public Vect2D mul(double k) {
        return new Vect2D(x*k,y*k);
    }
    public double mul(Vect2D v) {
        return x*v.x+y*v.y;
    }
    public double abs() {
        return Math.sqrt(x*x+y*y);
    }
    public double arg() {
        return Math.atan2(y,x);
    }
}

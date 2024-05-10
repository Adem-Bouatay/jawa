package ex1;

public class Cylinder extends Circle {
    private double h;

    public Cylinder(double x,double y,double r, double h) {
        super(x,y,r);
        this.h = h; 
    }
    public double volume(){
        return super.getSurface()*h;
    }
    public String toString(){
        return super.toString() + " Volume : " + this.volume();
    }
}

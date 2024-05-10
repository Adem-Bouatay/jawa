package ex1;

public class Circle extends Shape {
    final static double PI=3.14159256;
    private double radius ;
    private double surface;

    public Circle() { 
        radius = 0 ; 
    }
    public Circle(double x,double y,double r) {
        super(x,y) ; 
        radius = r ;
        surface = PI*r*r; 
    }
    public String toString() {
        return super.toString() + " Rayon : " + radius + " Surface : " + surface; 
    }
    public boolean isBigger(Circle c){
        return c.getRadius() < this.radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
        this.surface = PI*radius*radius;
    }
    public double getSurface() {
        return surface;
    }
}
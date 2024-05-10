package ex1;

public class MainShape {
    public static void main(String[] args) { 
        Circle c1,c2 ;
        c1 = new Circle(1,1,3) ;
        c2 = new Circle() ;
        System.out.println(c1.toString() + "\n" + c2.toString()) ;
        Cylinder c3 = new Cylinder(2, 3, 2, 5);
        System.out.println(c3);
        System.out.println(c1.isBigger(c3));
    } 
}

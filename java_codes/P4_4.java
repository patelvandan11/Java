interface GeometricShape{
    public void describe();
}
interface TwoDShape extends GeometricShape{
    public double area();
}
interface ThreeDShape extends GeometricShape{
    public double volume();
}

class Cone implements ThreeDShape{
    private double radius;
    private double height;
    public Cone(double radius,double height){
        this.radius=radius;
        this.height=height;
    }
    public double volume(){
        return (((double)1/3*(3.14))*(radius*radius)*height);
    }
    public void describe(){
        System.out.print("Cone:");
    }
}
class Rectangle implements TwoDShape{
    double width,height;
    Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    public double area(){
        return width*height;
    }
    public void describe(){
        System.out.print("Rectangle:");
    }
}
class Sphere implements ThreeDShape{
    double radius;
    Sphere(double radius){
        this.radius=radius;
    }
    public double volume(){
        return ((4/3)*3.14*(radius*radius*radius));
    }
    public void describe(){
        System.out.print("Sphere:");
    }
}
public class P4_4 {
    public static void main(String []args){
    Cone c1=new Cone(5,7);
    Rectangle r1=new Rectangle(6,6);
    Sphere s1=new Sphere(4);
    
    c1.describe();
    double c_volume=c1.volume();
    System.out.println(c_volume);
    r1.describe();
    double r_volume=r1.area();
    System.out.println(r_volume);
    s1.describe();
    double s_volume=s1.volume();
    System.out.println(s_volume);
    }
}

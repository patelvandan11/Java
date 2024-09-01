interface Solid {

    float findvolume();
    float display();
}
class Cube{
    float side;
    Cube(float side){
        this.side = side;
    }
    float volume(){
        return side*side*side;
    }
    void display(){
        System.out.println("Volume of Cube: "+volume());
    }
}
class Sphere{
    float radius;
    Sphere(float radius){
        this.radius = radius;
    }
    float volume(){
        return (4/3)*3.14f*radius*radius*radius;
    }
    void display(){
        System.out.println("Volume of Sphere: "+volume());
    }
}
class Demo{
    public static void main(String[] args) {
        Cube c = new Cube(5);
        c.display();
        Sphere s = new Sphere(5);
        s.display();
    }
}
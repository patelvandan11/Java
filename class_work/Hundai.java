// inheritance example 
// Hundai class is inheriting Car class
class Car{
    public static void start(){
        System.out.println("Car is starting");
    }
}
 
class Hundai extends Car{
    public static void Hundaistart(){
        System.out.println("Hundai car is starting");
    }
    
    
}
 
 class Main {
    public static void main(String[] args) {
        Car car=new Car();
        car.start();
        Hundai hundai=new Hundai();
        hundai.Hundaistart();
    }
}
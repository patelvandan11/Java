//  hoe to create a object of inner class from outter class 

//  access inner class outside outter class 
public class Outter {
    public void m1() {
        System.out.println("Outter class method");
    }
    class inner{public void m2(){
            System.out.println("inner class method");
    }}
}
class Test{
    public static void main(String[] args) {
        Outter o = new Outter();
        o.m1();
        Outter.inner i = o.new inner();
        // Outter.inner i1 = new Outter().new inner();
        i.m2();


        //  or 
        // new Outter().new inner().m2();
    }


}

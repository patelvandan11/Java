interface Outter{
    interface Inner{
        public void m1();
    }
}
class innerimpl implements Outter.Inner{
    public void m1(){
        System.out.println("m1");
    }
}
public class Classisideinterface{
    public static void main(String[] args){
        Outter.Inner i = new innerimpl();
    }
}

interface Outter{
    public void m1();
    class Innerimpl implements Outter.Inner{
        public void m2(){
            System.out.println("M2 nested interface method");
        }
    }
    interface Inner{
        public void m2();
    }
}


class Outterimpl implements Outter{
    public void m1(){
        System.out.println("M1 outer interface method");
    }
}

public class NestedInterface{
    public static void main(String[] args){
        Outter o = new Outterimpl();
        o.m1();
        Outter.Inner i = new Outter.Innerimpl();
        i.m2();
    }
}

// string bufferr
//  string interactive 
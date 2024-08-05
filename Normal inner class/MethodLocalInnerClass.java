class Outter {
    public void m1(){
        class Inner {

            public void m2() {
                System.out.println("inner class method");
            }
        }
        Inner i = new Inner();
        i.m2();
    }
}
class Test{
    public static void main(String[] args) {
        Outter o = new Outter();
        o.m1();
    }
}
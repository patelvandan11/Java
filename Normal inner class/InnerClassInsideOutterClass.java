class Outter {
    public void m1() {
        System.out.println("outter class method");
        Inner i = new Inner();   
        i.m2();
    }

    class Inner {   
        public void m2() {
            System.out.println("inner class method");
        }
    }
}

// class Test {
//     public static void main(String[] args) {
//         Outter o = new Outter();
//         o.m1();
//     }
// }


class tr {
    private String tot;
    private float rate;
    
    void total(){

    }
}

class two extends tr{
    void total(int km , float rate){
        System.out.println("Total fare for two: "+km*rate);
    }
}

class car extends tr{
    void total(int km , float rate){
        System.out.println("Total fare for car: "+km*rate);
    }

}

public class V{
    public static void main(String[] args) {
        two t = new two();
        t.total(500,5);
        car c = new car();
        c.total(200, 10);
    }
}

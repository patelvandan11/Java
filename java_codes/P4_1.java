class Cricket{
    String name;
    int age;
    void setdata(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
    }
}
class Match extends Cricket{
    int no_of_odi,no_of_test;
    Match(int no_of_odi,int no_of_test){
        this.no_of_odi=no_of_odi;
        this.no_of_test=no_of_test;
    }
    void display(){
        super.display();
        System.out.println("no of odi:"+no_of_odi);
        System.out.println("no of test:"+no_of_test);
        System.out.println();
    }
}
public class P4_1 {
    public static void main(String args[]){
        Match m[]=new Match[5];
        
        if(args.length!=20)
            System.out.println("Enter 20 argument");
        else{
            for(int i=0;i<5;i++){
                String name=args[i*4+0];
                int age=Integer.parseInt(args[i*4+1]);
                int n_odi=Integer.parseInt(args[i*4+2]);
                int n_test=Integer.parseInt(args[i*4+3]);
                m[i]=new Match(n_odi,n_test);
                m[i].setdata(name,age);
                m[i].display();
            }
        }
    }
}

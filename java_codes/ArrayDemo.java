class ArrayD{
    static void print_array(int a[]){
        for(int i:a){
            System.out.println(i);
        }
    }
}
public class ArrayDemo {
    public static void main(String[] args) {
    
    int b[]={1,5,2,3,2,};
    int a[]=new int[5];
    a[0]=1;
    a[1]=1;
    a[2]=1;
    a[3]=1;
    a[4]=1;

        ArrayD.print_array(a);
    ArrayD d1=new ArrayD();
    ArrayD d2=new ArrayD();
    ArrayD d3=new ArrayD();

    }
}

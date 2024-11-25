import java.util.Scanner;
class Student11{
    private int id;
    private int student_id;
    private float spi;

    Student11(int id,int student_id,float spi){
        this.id=id;
        this.student_id=student_id;
        this.spi=spi;
    }
    public void display(){
        System.err.println("id is :"+this.id);
        System.err.println("Student_id is :"+this.student_id);
        System.err.println("SPI is :"+this.spi);
    }

}


public class P3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student11 s[]= new Student11[n];

        for(int i=0 ; i<n ; i++){
            System.out.println("Enter id: ");
            int id = sc.nextInt();

            System.out.println("Enter sid: ");
            int stdid = sc.nextInt();

            System.out.println("Enter sip: ");
            float spi  = sc.nextFloat();

            s[i] = new Student11(id , stdid, spi);
        }

        for(int i = 0; i<n ; i++){
            s[i].display();
        }
        
    }
}

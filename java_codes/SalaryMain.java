class Salary{
    String name;
    int basic_salary;
    double da;
    double tax_deducted;
    double gross_salary;
    double net_salary;

    Salary(String name,int basic_salary){
        this.name=name;
        this.basic_salary=basic_salary;
        da=(basic_salary*74)/100;
        gross_salary=basic_salary+da;
        if(gross_salary>100000)
            tax_deducted=((gross_salary-100000)*0.1);
        else
            tax_deducted=0;
        net_salary=gross_salary-tax_deducted;
    }

    void display(){
        System.out.println("namme:"+name);
        System.out.println("Basic Salary:"+basic_salary);
        System.out.println("Dearness Allowance:"+da);
        System.out.println("Tex Deducted:"+tax_deducted);
        System.out.println("Net Salary:"+net_salary);
    }
    

}
public class SalaryMain {
    public static void main(String args[]){
        Salary s1=new Salary("pratik",500000);
        s1.display();
    }
}

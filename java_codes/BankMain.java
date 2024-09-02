class BankAccount{
    String Depositer_name;
    int acc_no;
    String acc_type;
    double balance;
    static int count=1;
    void creatAcc(String name,String type,double balance){
        this.acc_no=count;
        this.Depositer_name=name;
        this.acc_type=type;
        this.balance=balance;
        count++;
    }
    void deposite(double amount){
        this.balance+=amount;
        System.out.println(amount+"credited to your account no."+this.acc_no+"||"+"balance:"+this.balance);
    }
    void withdraw(double amount){
        if(amount>this.balance)
            System.out.println("insufficient balance");
        else{
            this.balance-=amount;
            System.out.println(amount+"debited from your account no."+this.acc_no+"||"+"balance:"+this.balance);
        }

    }
    public void balanceInquiry(){
        System.out.println("Name:"+this.Depositer_name);
        System.out.println("Account no.:"+this.acc_no);
        System.out.println("Account type:"+this.acc_type);
        System.out.println("Balance:"+this.balance);
    }
}

public class BankMain {
    public static void main(String []args){
        BankAccount b1=new BankAccount();
        BankAccount b2=new BankAccount();
        BankAccount b3=new BankAccount();
        BankAccount b4=new BankAccount();
        
        b1.creatAcc("shahir","current",50000);
        b1.balanceInquiry();
        b2.creatAcc("shahir","current",10000);
        b2.balanceInquiry();
        b1.deposite(5000);
        b2.withdraw(4000);
    }
}
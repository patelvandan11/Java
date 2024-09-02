class NotEnoughMoneyException extends Exception{
    NotEnoughMoneyException(String m){
        super(m);
    }
}
class Bank{
    double amount;
    double balance;
    int acc_no;
    static int  count=1;
    Bank(double balance){
        this.acc_no=count;
        this.balance=balance;
        count++;
    }
    void deposite(double amount){
        if(amount>0){
            System.out.println("balance before deposite:"+this.balance);
            this.balance+=amount;
            System.out.println("balance after deposite:"+this.balance);
        }
        else
        System.out.println("amount should be>0");
    }
    void withdraw(double amount) throws ArithmeticException,NotEnoughMoneyException{
            if(amount<0 || balance<amount)
                throw new ArithmeticException();    
            else{
                System.out.println("amount should be>0"+this.balance);
                balance-=amount;
                System.out.println("balance after withdraw:"+this.balance);
                if(balance<500)
                    throw new NotEnoughMoneyException("You have not enough balance in your account");
            }
    }
}

public class P7_1 {
    public static void main(String args[]){
        Bank b=new Bank(10000);
        b.deposite(5000);
        try{
            b.withdraw(14600);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(NotEnoughMoneyException e){
            System.out.println(e);
        }
        finally{System.out.println("Your task done successfuly");}
    }
}

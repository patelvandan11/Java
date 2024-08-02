public class BankAccount {
    private String depositorName;
    private int accNo;
    private static int nextAccNo =0;  
    private String accType;
    private double balance;
    
    
    public void create_acc(String depositorName, double initialBalance, String accType) {
        this.depositorName = depositorName;
        this.accNo = nextAccNo++;
        this.balance = initialBalance;
        this.accType = accType;
    }
 
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("New balance: " + balance);
        }
        else {
            System.out.println("Deposit amount must be positive.");
        }
    }
 
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
            System.out.println("New balance: " + balance);
        } 
        else if (amount > balance)
         {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
    public void BalaneInquiry(){
        System.out.println("Accout NO is:"+accNo);
        System.out.println("name NO is:"+depositorName);
        System.out.println("account type is :"+accType);
        System.out.println("currunt balce is :"+balance);
    }   


    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.create_acc("vandan",0, "saving");
        account1.deposit(2000);
        account1.BalaneInquiry();
    }
}

public class BankAccount {
    private String depositorName;
    private int accNo;
    private static int nextAccNo = 1;  
    private String accType;
    private double balance;
    
    
    public BankAccount(String depositorName, double initialBalance, String accType) {
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
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
 
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
            System.out.println("New balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount("vandan",2000,"savings");
        // String depositorName, double initialBalance, String accType
        account.deposit(2000);
    }
}
 

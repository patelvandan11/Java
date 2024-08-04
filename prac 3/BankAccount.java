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

    public void balanceInquiry() {
        System.out.println("Account number: " + accNo);
        System.out.println("Depositor name: " + depositorName);
        System.out.println("Account type: " + accType);
        System.out.println("Current balance: " + balance);
    }

    public static BankAccount createAcc(String depositorName, double initialBalance, String accType) {
        return new BankAccount(depositorName, initialBalance, accType);
    }

    public static void main(String[] args) {
        BankAccount account1 = createAcc("Vandan", 2000, "savings");
        account1.deposit(500);
        account1.withdraw(300);
        account1.balanceInquiry();

        BankAccount account2 = createAcc("abc", 1000, "business");
        account2.deposit(200);
        account2.withdraw(100);
        account2.balanceInquiry();
    }
}

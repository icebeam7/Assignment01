package classes;

public class BankAccount {
    public double Balance;
    public double InterestRate;
    private String accountNumber;

    /* 
    public void Initialize(double balance)
    {
        this.Balance = balance;
    }

    public void Initialize(String account, double balance, double interestRate)
    {
        this.accountNumber = account;
        this.Balance = balance;
        this.InterestRate = interestRate;
    }

    public void Initialize(double balance, double interestRate)
    {
        this.Balance = balance;
        this.InterestRate = interestRate;
    }
*/

    public BankAccount(String account, double balance, double interestRate)
    {
        this.accountNumber = account;
        this.Balance = balance;
        this.InterestRate = interestRate;
    }

    public BankAccount(double balance, double interestRate)
    {
        this.accountNumber = "0000";
        this.Balance = balance;
        this.InterestRate = interestRate;
    }

    public BankAccount(double balance)
    {
        this.accountNumber = "0000";
        this.Balance = balance;
        this.InterestRate = 0.10;
    }

    public void AddInterest() {
        double interest = Balance * InterestRate;
        Balance += interest;
    }

    public void Deposit(double amount) {
        Balance += amount;
    }

    public boolean IsOverDrawn(double amount) {
        return Balance - amount < 0;
    }

    public void Withdraw(double amount) {
        if (!IsOverDrawn(amount))
            Balance -= amount;        
    }

    public String getAccountNumber(){
        return accountNumber;
    }

}

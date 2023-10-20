import classes.*;
import java.text.NumberFormat;

public class App {
    public static void main(String[] args) throws Exception {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        BankAccount savings = new BankAccount("12345", 200, 0.05);
        //savings.accountNumber = "12345";
        //savings.Balance = 200;
        //savings.InterestRate = 0.05;
        savings.AddInterest();

        BankAccount checking = new BankAccount(500);
        //checking.Balance = 500;
        
        double netWorth = savings.Balance + checking.Balance;
        //System.out.println( String.format("My net worth is %.2f", netWorth) );
        String moneyString = formatter.format(netWorth);
        System.out.println( String.format("My net worth is %s", moneyString) );

        BankAccount retirement = new BankAccount("89023", 200, 0.05);
        //retirement.Initialize("89023", 200, 0.05);

        System.out.println(String.format("Account number: %s", retirement.getAccountNumber()));
        System.out.println(String.format("Account balance: %f", retirement.Balance));
        System.out.println(String.format("Account interest rate: %f", retirement.InterestRate));

        retirement.Deposit(50);
        System.out.println(String.format("Account balance: %f", retirement.Balance));

        retirement.Withdraw(100);
        System.out.println(String.format("Account balance: %f", retirement.Balance));

        retirement.Withdraw(155);
        System.out.println(String.format("Account balance: %f", retirement.Balance));
    }
}

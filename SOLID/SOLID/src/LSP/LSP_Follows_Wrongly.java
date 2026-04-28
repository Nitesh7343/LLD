import java.util.*;

interface Account{
    void deposit(double amount);
    void withdraw(double amount);
}

//saving account should be deposite and withdraw
class SavingAccount implements Account{
    double balance;

    public SavingAccount() {
        this.balance = 0;
    }

     public SavingAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        System.out.println("Old balance = "+ balance);
        balance += amount;
        System.out.println("Amount Deposited to Saving Account");
        System.out.println("New Balance = " + balance);
    }

    public void withdraw(double amount) {
        if(amount > balance) {
            System.out.println("Insufficient Balance");
            return;
        }
        System.out.println("Old balance = " + balance);
        balance -= amount;
        System.out.println("Amount Withdrawn to Saving Account");
        System.out.println("New Balance = " + balance);
    }
}

//current account should be deposite and withdraw
class CurrentAccount implements Account {
    double balance;

    public CurrentAccount() {
        balance = 0;
    }

    public CurrentAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        System.out.println("Old balance = "+ balance);
        balance += amount;
        System.out.println("Amount Deposited to Current Account");
        System.out.println("New Balance = " + balance);
    }

    public void withdraw(double amount) {
        if(amount > balance) {
            System.out.println("Insufficient Balance");
            return;
        }
        System.out.println("Old balance = " + balance);
        balance -= amount;
        System.out.println("Amount Withdrawn to Current Account");
        System.out.println("New Balance = " + balance);
    }
}

// fixed deposite account should be deposite but not withdraw
class FDAccount implements Account {
    double balance;

    public FDAccount() {
        balance = 0;
    }

    public FDAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        System.out.println("Old balance = "+ balance);
        balance += amount;
        System.out.println("Amount Deposited to FD Account");
        System.out.println("New Balance = " + balance);
    }

    public void withdraw(double amount) {
        throw new FDWithdrawException("can't withdraw from FixedDeposite Account");
    }
}

class BankClient {

    private List<Account> accounts;

    public BankClient(List<Account> accounts) {
        this.accounts = accounts;
    }

    void processTransactions() {
    for (Account acc : accounts) {
        System.out.println("-------------------");
        acc.deposit(1000);

        // Checking account type explicitly
        if (acc instanceof FDAccount) {
            System.out.println("Skipping withdrawal for Fixed Term Account.");
        } else {
            try {
                acc.withdraw(500);
            } catch (RuntimeException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
        System.out.println("-------------------");
    }
}
}

class FDWithdrawException extends RuntimeException {
    public FDWithdrawException(String msg) {
        super(msg);
    }
}
public class LSP_Follows_Wrongly {
    public static void main(String[] args) {
        
        List<Account> accounts = new ArrayList<>();
        accounts.add(new SavingAccount());
        accounts.add(new CurrentAccount(10_000));
        accounts.add(new FDAccount()); // This will break LSP
        BankClient client = new BankClient(accounts);
        client.processTransactions();

    }
}

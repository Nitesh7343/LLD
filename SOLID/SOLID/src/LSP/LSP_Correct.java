import java.util.*;

// Only deposit behavior
interface DepositAccount {
    void deposit(double amount);
}

// Only withdraw behavior
interface WithdrawAccount {
    void withdraw(double amount);
}

// Saving Account (supports both)
class SavingAccount implements DepositAccount, WithdrawAccount {
    private double balance;

    public SavingAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        System.out.println("Saving Account Deposit: " + amount);
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Saving: Insufficient balance");
            return;
        }
        System.out.println("Saving Account Withdraw: " + amount);
        balance -= amount;
    }
}

// Current Account (supports both)
class CurrentAccount implements DepositAccount, WithdrawAccount {
    private double balance;

    public CurrentAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        System.out.println("Current Account Deposit: " + amount);
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Current: Insufficient balance");
            return;
        }
        System.out.println("Current Account Withdraw: " + amount);
        balance -= amount;
    }
}

// FD Account (ONLY deposit)
class FDAccount implements DepositAccount {
    private double balance;

    public FDAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        System.out.println("FD Account Deposit: " + amount);
        balance += amount;
    }
}

// Client class (NO instanceof, NO violation)
class BankClient {
    private List<DepositAccount> depositAccounts;
    private List<WithdrawAccount> withdrawAccounts;

    public BankClient(List<DepositAccount> d, List<WithdrawAccount> w) {
        this.depositAccounts = d;
        this.withdrawAccounts = w;
    }

    public void processTransactions() {
        System.out.println("---- Deposits ----");
        for (DepositAccount acc : depositAccounts) {
            acc.deposit(1000);
        }

        System.out.println("---- Withdrawals ----");
        for (WithdrawAccount acc : withdrawAccounts) {
            acc.withdraw(500);
        }
    }
}

// Main class
public class LSP_Correct {
    public static void main(String[] args) {

        // Deposit accounts (all)
        List<DepositAccount> depositAccounts = new ArrayList<>();
        depositAccounts.add(new SavingAccount(5000));
        depositAccounts.add(new CurrentAccount(10000));
        depositAccounts.add(new FDAccount(20000));

        // Withdraw accounts (only those that support withdraw)
        List<WithdrawAccount> withdrawAccounts = new ArrayList<>();
        withdrawAccounts.add(new SavingAccount(5000));
        withdrawAccounts.add(new CurrentAccount(10000));

        BankClient client = new BankClient(depositAccounts, withdrawAccounts);
        client.processTransactions();
    }
}
class BankAccount {
    private double balance;

    BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount");
        }
    }

    double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    void withdraw(double amount) {
        if (getBalance() - amount >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal not allowed: Balance cannot fall below 100");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);
        account.deposit(200);
        account.withdraw(100);
        System.out.println("BankAccount Balance: " + account.getBalance());

        SavingsAccount savingsAccount = new SavingsAccount(500);
        savingsAccount.deposit(200);
        savingsAccount.withdraw(600); // Will be rejected
        savingsAccount.withdraw(400); // Will succeed
        System.out.println("SavingsAccount Balance: " + savingsAccount.getBalance());
    }
}
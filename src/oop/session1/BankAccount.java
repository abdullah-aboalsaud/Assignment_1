package oop.session1;

public class BankAccount {
    private String accountId;
    private double balance;


    public BankAccount(String accountId, double initialBalance) {
        this.accountId = accountId;
        this.balance = initialBalance;
    }


    public BankAccount(String accountId) {
        this.accountId = accountId;
        this.balance = 0;
    }

    public String getAccountId() {
        return accountId;
    }


    public double getBalance() {
        return balance;
    }


    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }


    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false; // Insufficient balance
        }
        balance -= amount;
        return true; // Successful withdrawal
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public static void main(String[] args) {
        // Test the BankAccount class
        BankAccount account = new BankAccount("123456", 1000);
        System.out.println("Initial Balance: " + account.getBalance());
        account.deposit(500);
        System.out.println("After Deposit: " + account.getBalance());
        account.withdraw(300);
        System.out.println("After Withdrawal: " + account.getBalance());
    }
}

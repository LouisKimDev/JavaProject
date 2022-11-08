package CH07.arraylist;

public class BankAccount2 {
    private int accountNumber;
    private double balance;

    public BankAccount2(int anAccountNumber){
        accountNumber = anAccountNumber;
        balance = 0;
    }
    public BankAccount2(int anAccountNumber, double initialBalance){
        accountNumber = anAccountNumber;
        balance = initialBalance;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void deposit(double amount){
        double newBalance = balance + amount;
        balance = newBalance;
    }
    public void withdraw(double amount){
        double newBalance = balance - amount;
        balance = newBalance;
    }
    public double getBalance(){
        return balance;
    }
    public void transferFunds(BankAccount2 destination, double amount){
        destination.balance = destination.balance + amount;
        this.balance = this.balance - amount;
    }
}

package CH10.measure1;

public class BankAccount implements Measurable {

    private int accountNumber;
    private double balance;

    public BankAccount(int anAccountNumber){
        accountNumber = anAccountNumber;
        balance = 0;
    }

    public BankAccount(int anAccountNumber, double initialBalance){
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

    public double getMeasure(){
        return balance;
    }
}

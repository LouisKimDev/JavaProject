package CH07.arraylist;

import java.util.ArrayList;

public class ArrayListTester {
    public static void main(String[] args){
        ArrayList<BankAccount2> accounts = new ArrayList<BankAccount2>();
        accounts.add(new BankAccount2(1001,20000));
        accounts.add(new BankAccount2(1015, 10000));
        accounts.add(1,new BankAccount2(1008,50000));
        accounts.remove(0);

        System.out.println("Size: " + accounts.size());
        System.out.println("Expected: 3");
        BankAccount2 first = accounts.get(0);
        System.out.println("First account number: " + first.getAccountNumber());
        System.out.println("Expected: 1008");
        BankAccount2 last = accounts.get(accounts.size()-1);
        System.out.println("Last account number: " + last.getAccountNumber());
        System.out.println("Expected: 1729");
        BankAccount2 withDrawAccount = accounts.get(2);
        BankAccount2 destinationAccount = accounts.get(1);
        withDrawAccount.transferFunds(destinationAccount, 5000);
        System.out.println("Balance of 1015"+destinationAccount.getBalance());
        System.out.println("Expected 15000");
    }
}

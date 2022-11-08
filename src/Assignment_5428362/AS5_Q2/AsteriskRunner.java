package Assignment_5428362.AS5_Q2;

import java.util.Scanner;

public class AsteriskRunner {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Asterisk stars = new Asterisk();

        System.out.print("Enter a number: ");
        int x = in.nextInt();

        stars.Display(x);
    }

}

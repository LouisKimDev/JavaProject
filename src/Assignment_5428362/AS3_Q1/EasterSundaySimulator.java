package Assignment_5428362.AS3_Q1;

import java.util.Scanner;

public class EasterSundaySimulator {
    public static void main(String[] args)
    {
        EasterSunday sunday = new EasterSunday();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = (int) in.nextDouble();
        sunday.enterYear(year);

        System.out.print("Easter Sunday's Month, Date : " + sunday.giveMonth() + ", " + sunday.giveDate() );

    }
}

package Assignment_5428362.AS4_Q2;

import java.util.Scanner;

public class DataAnalyzer {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        DataSet data = new DataSet();

        boolean done = false;
        while(!done)
        {
            System.out.print("Enter value, Q to quit: ");
            String input = in.next();
            if (input.equalsIgnoreCase("Q"))
                done = true;
            else
            {
                double x = Double.parseDouble(input);
                data.add(x);
            }
        }
        System.out.println("Count = " + data.getCount());
        System.out.println("Average = " + data.getAverage());
        System.out.printf("StandardDeviation = %.3f", data.getStandardDeviation());
    }
}

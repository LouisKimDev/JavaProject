package Assignment_5428362.AS5_Q1;

import java.util.Scanner;

public class DataAnalyzer {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        DataSet data = new DataSet();

        boolean done = false;
        while(!done){
            System.out.print("Enter a value(Q to Exit): ");
            String input = in.next();
            if(input.equalsIgnoreCase("q"))
            {
                done = true;
            }
            else{
                double x = Double.parseDouble(input);
                data.add(x);
            }
        }
        System.out.print("Average: "+data.getAverage()+
                "\nLargest value: "+data.getLargest()+
                "\nSmallest value: "+data.getSmallest()+
                "\nRange: "+data.getRange());
    }

}

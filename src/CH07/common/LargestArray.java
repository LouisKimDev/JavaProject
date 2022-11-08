package CH07.common;
import java.util.Scanner;
public class LargestArray {
    public static void main(String[] args)
    {
        final int LENGTH = 100;
        double[] values = new double[LENGTH];
        int currentSIze = 0;

        System.out.println("Please enter values, Q to Exit: ");
        Scanner in = new Scanner(System.in);

        while (in.hasNextDouble() && currentSIze < values.length)
        {
            values[currentSIze] = in.nextDouble();
            currentSIze++;
        }

        double largest = values[0];
        for(int i = 1; i< currentSIze;i++){
            if (values[i]>largest)
            {
                largest = values[i];
            }
        }

        for (int i = 0; i < currentSIze; i++)
        {
            System.out.print(values[i]);
            if(values[i]==largest){
                System.out.print(" <== largest value");
            }
            System.out.println();
        }
    }
}


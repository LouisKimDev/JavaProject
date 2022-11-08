package Assignment_5428362.AS3_Q2;

import java.util.Scanner;

public class DewPointSimulator {
    public static void main(String[] args)
    {
        DewPoint dew = new DewPoint();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter relative humidity: ");
        double RH = in.nextDouble();

        System.out.print("Enter actual temperature: ");
        double T = in.nextDouble();

        dew.fx(T, RH);

        System.out.println("DewPoint : " + dew.Td());
    }
}

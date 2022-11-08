package Assignment_5428362.AS3_Q3;

import java.util.Scanner;

public class LiquidTemperatureSimulator {
    public static void main(String[] args)
    {
        LiquidTemperature liquid = new LiquidTemperature();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter power factor: ");
        double pf = in.nextDouble();

        liquid.Vs(pf);

        System.out.printf("Vs : %.3f", liquid.VsOut());
        System.out.println(" V");

    }
}

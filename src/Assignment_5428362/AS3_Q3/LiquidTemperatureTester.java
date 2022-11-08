package Assignment_5428362.AS3_Q3;

public class LiquidTemperatureTester {
    public static void main(String[] args){
        LiquidTemperature liquidTester = new LiquidTemperature();

        liquidTester.Vs(0.6);
        System.out.printf("Vs : %.3f", liquidTester.VsOut());
        System.out.println(" V");
        System.out.printf("Expected : 236 V");

    }
}

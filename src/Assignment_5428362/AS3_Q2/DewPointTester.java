package Assignment_5428362.AS3_Q2;

public class DewPointTester {
    public static void main(String[] args){
        DewPoint dew = new DewPoint();

        dew.fx(25,0.6);
        System.out.printf("Dewpoint: %.2f\n", dew.Td());
        System.out.println("Expected Dewpoint: 16.68");
    }
}

package Midterm3_1;

public class FactorGeneratorTester {
    public static void main(String[] args){
        FactorGenerator generator = new FactorGenerator(150);
        while (generator.hasMoreFactors()){
            System.out.println(generator.nextFactor());
        }
    }


}

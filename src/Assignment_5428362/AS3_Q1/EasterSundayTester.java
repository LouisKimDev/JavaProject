package Assignment_5428362.AS3_Q1;

public class EasterSundayTester {
    public static void main(String[] args){
        EasterSunday sunday1 = new EasterSunday();

        sunday1.enterYear(2001);
        System.out.print("Easter Sunday's Month, Date : " + sunday1.giveMonth() + ", " + sunday1.giveDate() );
        System.out.print("\nExpected Month, Date : 4, 15");

    }

}

package CH03.counter;

public class CounterTester {
    public static void main(String[] args){
        Counter tallyCounter = new Counter();
        Counter concertCounter = new Counter();

        tallyCounter.reset();
        concertCounter.reset();

        tallyCounter.click();
        tallyCounter.click();
        tallyCounter.click();

        concertCounter.click();

        System.out.println("Tally Counter value is :"+tallyCounter.getValue());
        System.out.println("Concert Counter value is :"+concertCounter.getValue());
    }
}

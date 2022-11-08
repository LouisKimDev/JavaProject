package CH06.invest1;

public class Investment {
    private double balance;
    private double rate;
    private int years;
    public Investment(double aBalance, double aRate){
        balance = aBalance;
        rate = aRate;
        years = 0;
    }
    public void waitForBalance(/**double targetBalance**/int numberOfYears)
    {
        /** while (balance < targetBalance)
        {
         years++;
         double interest = balance * rate / 100;
         balance = balance + interest;
        } **/
        for(int i = 1; i <= numberOfYears; i++)
        {
            double interest = balance * rate/100;
            balance = balance + interest;
        }
     years = years + numberOfYears;
    }
    public double getBalance()
    {
        return balance;
    }
    public int getYears()
    {
        return years;
    }
}

package Midterm3_1;

public class FactorGenerator {
    private int factor;
    private int number;
    private boolean done;

    public FactorGenerator(int a){
        factor = 2;
        number = a;
    }
    public int nextFactor(){
        number = number/factor;
        return factor;
    }
    public boolean hasMoreFactors(){
        boolean hasMoreFactors = false;
        done = false;
        if(factor <= number){
            while(!done){
                if(number%factor != 0)
                {
                    factor++;
                }
                else{
                    done = true;
                    hasMoreFactors = true;
                }
            }
        }
        return hasMoreFactors;
    }

}

package Assignment_5428362.AS4_Q2;

public class DataSet {

    private double sum;
    private int count;
    private double sumPow;

    public DataSet(){
        sum = 0;
        sumPow = 0;
        count = 0;
    }
    public void add(double value){
        sum = sum + value;
        sumPow = sumPow+Math.pow(value,2);
        count++;
    }
    public double getAverage(){
        if (count== 0) return 0;
        else return sum/count;
    }
    public double getStandardDeviation(){
        if (count == 0) return 0;
        else return Math.sqrt((sumPow-Math.pow(sum,2)/count)/(count-1));
    }
    public int getCount(){
        return count;
    }

}

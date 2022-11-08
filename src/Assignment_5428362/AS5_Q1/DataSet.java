package Assignment_5428362.AS5_Q1;

public class DataSet {
    private double average;
    private double minimum;
    private double maximum;
    private double count;
    private double sum;
    private double range;

    public void DataSet(){
        average = 0;
        minimum = 0;
        maximum = 0;
        sum = 0;
        count = 0;
    }
    public void add(double value){
        count++;
        if(count == 1) {
            minimum = value;
        }
        else if(minimum >= value){
            minimum = value;
        }
        else if(maximum <= value){
            maximum = value;
        }
        sum = sum + value;
        average = sum/count;
        range = maximum - minimum;
    }
    public double getAverage(){
        return average;
    }
    public double getSmallest(){
        return minimum;
    }
    public double getLargest(){
        return maximum;
    }
    public double getRange(){
        return range;
    }
}

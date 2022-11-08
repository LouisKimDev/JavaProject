package CH10.measure1;

public class Coin implements Measurable{
    private String coinType;
    private double coinValue;

    public Coin(double value, String type){
        coinValue = value;
        coinType = type;
    }
    public double getMeasure(){
        return coinValue;
    }
}

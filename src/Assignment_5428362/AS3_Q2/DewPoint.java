package Assignment_5428362.AS3_Q2;

public class DewPoint {
    private double T;
    private double RH;
    public double Td;
    public double fx;
    public double a;
    public double b;

    public DewPoint(){T = 0; RH = 0; a=17.27; b=237.7;}

    public void fx(double Tem, double ReHu){
        T = T + Tem;
        RH = RH + ReHu;
        fx = a * T / (b + T) + Math.log(RH);
    }
    public double Td(){
        Td = b*fx/(a-fx);
        return Td;
    }
}

package Assignment_5428362.AS3_Q3;

public class LiquidTemperature {
    private double P;
    private double R;
    private double Vt;
    public double pf;
    public double Vs;

    public LiquidTemperature(){P=260;R=20;Vt=120;pf=0;Vs=0;}
    public void Vs(double PF){
        pf = pf + PF;
        Vs = Math.sqrt(Math.pow((Vt+((2*R*P)/Vt)),2)+(Math.pow((2*R*P)/(pf *Vt),2)*(1-Math.pow(pf,2))));
    }
    public double VsOut(){
        return Vs;
    }

}

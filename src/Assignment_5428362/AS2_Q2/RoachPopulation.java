package Assignment_5428362.AS2_Q2;

public class RoachPopulation {
    private double Population;
    public RoachPopulation(){Population= 0;}
    public RoachPopulation(double initialPopulation){Population = initialPopulation;}
    public void breed(){Population = Population*2;}
    public void spray(double i){Population = Population * (1 - 0.01 * i);}
    public double getPopulation(){return Population;}
}

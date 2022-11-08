package Assignment_5428362.AS4_Q1;

public class WaveLength {
    private double x;
    public WaveLength(double electromagnetic){
        x = electromagnetic;
    }
    public String getDescription(){
        String y;
        if(x > 0.1)
        {
            y = "Type: Radio Waves";
        }
        else if(0.1>=x&&x>Math.pow(10,-3))
        {
            y = "Type: Microwaves";
        }
        else if(Math.pow(10,-3)>=x&&x>7*Math.pow(10,-7))
        {
            y = "Type: Infrared";
        }
        else if(7*Math.pow(10,-7)>=x&&x>4*Math.pow(10,-7))
        {
            y = "Type: Visible light";
        }
        else if(4*Math.pow(10,-7)>=x&&x>Math.pow(10,-8))
        {
            y = "Type: Ultraviolet";
        }
        else if(Math.pow(10,-8)>=x&&x>Math.pow(10,-11))
        {
            y = "Type: X-rays";
        }
        else
            y = "Type: Gamma rays";
        return y;
    }
}

package Assignment_5428362.AS4_Q1;

public class Frequency {
    private double x;
    public Frequency(double electromagnetic){
        x = electromagnetic;
    }
    public String getDescription(){
        String y;
        if(x > 3 * Math.pow(10,19))
        {
            y = "Type: Gamma rays";
        }
        else if(3*Math.pow(10,19)>=x&&x> 3 * Math.pow(10,16))
        {
            y = "Type: X-rays";
        }
        else if(3*Math.pow(10,16)>=x&&x>7.5*Math.pow(10,14))
        {
            y = "Type: Ultraviolet";
        }
        else if(7.5*Math.pow(10,14)>=x&&x>3*Math.pow(10,14))
        {
            y = "Type: Visible light";
        }
        else if(4*Math.pow(10,14)>=x&&x>3*Math.pow(10,11))
        {
            y = "Type: Infrared";
        }
        else if(3*Math.pow(10,11)>x&&x>3*Math.pow(10,9))
        {
            y = "Type: Microwaves";
        }
        else
            y = "Type: Radio Waves";
        return y;
    }
}

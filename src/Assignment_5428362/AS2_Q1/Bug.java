package Assignment_5428362.AS2_Q1;

public class Bug {
    private int Position;
    private int movement = 1;
    public Bug(){Position = 0;}
    public Bug(int initialposition){Position=initialposition;}
    public void move(){Position+=movement;}
    public void turn(){movement = -movement;}
    public int getPosition(){return Position;}
}

package Assignment_5428362.AS1_Q2;

import java.util.Random;

public class DieSimulator {
    public static void main(String[] args)
    {
        Random num = new Random();

        int x = num.nextInt(5);
        System.out.println(x+1);
    }

}

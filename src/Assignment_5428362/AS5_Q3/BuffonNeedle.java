package Assignment_5428362.AS5_Q3;

import java.util.Random;

public class BuffonNeedle {
    public static void main(String[] args){
        final double TRIES = 10000;
        Random generator = new Random();
        Random generator2 = new Random();
        int hits = 0;
        for (int i = 1; i <= TRIES; i++) {
            double lower = generator.nextDouble() *2;
            int angle = generator2.nextInt(180);
            double y = lower + Math.sin(Math.toRadians(angle));

            if (y >= 2) hits++;


        }
        System.out.println("Estimate for "+hits);
        double x = TRIES/hits;

        System.out.println("Estimate for "+x);
    }
}

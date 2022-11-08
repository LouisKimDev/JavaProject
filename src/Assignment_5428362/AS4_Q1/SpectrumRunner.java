package Assignment_5428362.AS4_Q1;

import java.util.Scanner;

public class SpectrumRunner {
    public static void main(String[] args){
        int choice;
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        System.out.print("Choose the type (1.Frequency 2.Wavelength): ");
        choice = in.nextInt();

        if(choice == 1){
            System.out.print("Enter the Frequency: ");
            double x = in2.nextDouble();
            Frequency f = new Frequency(x);
            System.out.println(f.getDescription());
        }
        else{
            System.out.print("Enter the Wavelength: ");
            double x = in2.nextDouble();
            WaveLength w = new WaveLength(x);
            System.out.println(w.getDescription());
        }
    }
}

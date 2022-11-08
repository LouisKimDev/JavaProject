package Assignment_5428362.AS2_Q3;

import CH03.Car.CarComponent;

import javax.swing.*;

public class StarViewer {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        frame.setSize(500,400);
        frame.setTitle("Three stars");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        StarComponent component = new StarComponent();
        frame.add(component);

        frame.setVisible(true);

    }
}

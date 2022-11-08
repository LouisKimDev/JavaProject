package Assignment_5428362.AS1_Q1;

import Assignment_5428362.AS1_Q1.HumanFaceComponent;

import javax.swing.JFrame;

public class HumanFaceViewer {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(150,250);
        frame.setTitle("Cyan hair guy greetings");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        HumanFaceComponent component = new HumanFaceComponent();
        frame.add(component);


        frame.setVisible(true);
    }
}

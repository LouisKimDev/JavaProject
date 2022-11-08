package Assignment_5428362.AS2_Q3;

import javax.swing.JComponent;
import java.awt.*;

public class StarComponent extends JComponent{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        Star star1 = new Star(0,0);
        Star star2 = new Star(150,0);
        Star star3 = new Star(300,0);

        g2.setColor(Color.RED);
        star1.draw(g2);
        g2.setColor(Color.YELLOW);
        star2.draw(g2);
        g2.setColor(Color.GREEN);
        star3.draw(g2);
    }
}

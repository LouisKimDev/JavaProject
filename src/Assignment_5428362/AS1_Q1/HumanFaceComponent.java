package Assignment_5428362.AS1_Q1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;



public class HumanFaceComponent extends JComponent{
    public void paintComponent (Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        //Draw the head
        Ellipse2D.Double head = new Ellipse2D.Double(5,10,100,150);
        g2.draw(head);

        //Draw the hair
        g2.setColor(Color.CYAN);
        Arc2D.Double hair = new Arc2D.Double(20,10,70,50,0,180,Arc2D.PIE);
        g2.draw(hair);
        g2.fill(hair);

        //Draw the eyebrow
        g2.setColor(Color.BLACK);
        Arc2D.Double eyebrow = new Arc2D.Double(20,60,25,13,0,180,Arc2D.OPEN);
        g2.draw(eyebrow);

        //Draw the eyebrow2
        Arc2D.Double eyebrow2 = new Arc2D.Double(65,60,25,13,0,180,Arc2D.OPEN);
        g2.draw(eyebrow2);

        //Draw the eyes
        g2.setColor(Color.BLACK);
        Ellipse2D.Double eye = new Ellipse2D.Double(20,70,25,22);
        g2.fill(eye);

        //Draw the eye2
        g2.setColor(Color.BLACK);
        Ellipse2D.Double eye2 = new Ellipse2D.Double(65,70,25,22);
        g2.fill(eye2);

        //Draw the nose
        g2.setColor(Color.RED);
        Line2D.Double nose = new Line2D.Double(55,90,55,120);
        g2.draw(nose);

        //Draw the mouth
        Line2D.Double mouth = new Line2D.Double(40,130,70,130);
        g2.setColor(Color.RED);
        g2.draw(mouth);

        //Draw the greeting
        g2.setColor(Color.BLUE);
        g2.drawString("Hello, Guys!",5,175);

    }
}

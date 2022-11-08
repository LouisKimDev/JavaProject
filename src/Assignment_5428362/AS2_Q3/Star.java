package Assignment_5428362.AS2_Q3;

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Star {
    private int xP;
    private int yP;
    public Star(int x1, int y1)
    {
        xP = x1;
        yP = y1;
    }

    public void draw(Graphics2D g2) {
        Point2D.Double r1
                = new Point2D.Double(xP, yP);
        Point2D.Double r2
                = new Point2D.Double(xP + 50, yP);
        Point2D.Double r3
                = new Point2D.Double(xP + 100, yP);
        Point2D.Double r4
                = new Point2D.Double(xP, yP + 50);
        Point2D.Double r5
                = new Point2D.Double(xP, yP + 100);
        Point2D.Double r6
                = new Point2D.Double(xP + 50, yP + 50);
        Point2D.Double r7
                = new Point2D.Double(xP + 100, yP + 50);
        Point2D.Double r8
                = new Point2D.Double(xP + 50, yP + 100);
        Point2D.Double r9
                = new Point2D.Double(xP + 100, yP + 100);

        Line2D.Double s1
                = new Line2D.Double(r1, r9);
        Line2D.Double s2
                = new Line2D.Double(r2, r8);
        Line2D.Double s3
                = new Line2D.Double(r3, r5);
        Line2D.Double s4
                = new Line2D.Double(r4, r7);

        g2.draw(s1);
        g2.draw(s2);
        g2.draw(s3);
        g2.draw(s4);
    }

}

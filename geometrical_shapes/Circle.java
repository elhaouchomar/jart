package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Circle implements Drawable {
    Point center;
    int radius;
    Color color;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
        this.color = getColor();

    }


public static Circle random(int maxX, int maxY) {
        Random rand = new Random();
        Point center = new Point();
        int radius = rand.nextInt(Math.max(maxX, maxY));
        return new Circle(center, radius);
    }

    @Override
    public void draw(Displayable displayable) {
        int cx = this.center.x;
        int cy = this.center.y;
        int r = this.radius;
        double stepSize = 0.1;
        double step = (2.0 * Math.PI * r);
        for (double i = 0.0; i <= step; i += stepSize) {
            double theta = i * 2.0 * Math.PI / step;
            int x = (int) (cx + r * Math.cos(theta));
            int y = (int) (cy + r * Math.sin(theta));
            displayable.display(x, y, this.color);
        }
    }
    
}
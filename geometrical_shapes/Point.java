package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Point implements Drawable{
    int x;
    int y;
    Color color;

    public Point() {
        this.x = (int) (Math.random() * 1000);
        this.y = (int) (Math.random() * 1000);
        this.color = getColor();
    }


    public Point(int y , int x) {
        this.x = y;
        this.y = x;
        this.color = getColor();
    }


     public static Point random(int maxX, int maxY) {
        Random rand = new Random();
        return new Point(rand.nextInt(maxX), rand.nextInt(maxY));
    }
    public void draw(Displayable displayable){

    }
}

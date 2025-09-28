package geometrical_shapes;

import java.awt.Color;

public class Rectangle implements Drawable {
    Point topLeft, bottomRight;
    Color color;

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        this.color = getColor();
    }

    @Override
    public void draw(Displayable d) {
        Point topRight = new Point(bottomRight.x, topLeft.y);
        Point bottomLeft = new Point(topLeft.x, bottomRight.y);

        new Line(topLeft, topRight, color).draw(d);
        new Line(topLeft, bottomLeft, color).draw(d);
        new Line(topRight, bottomRight, color).draw(d);
        new Line(bottomLeft, bottomRight, color).draw(d);
    }
}

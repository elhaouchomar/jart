package geometrical_shapes;
import java.awt.Color;

public class Triangle  implements Drawable {
     Point p1;
     Point p2;
     Point p3;
    Color color;

    public Triangle(Point p1,Point p2, Point p3){
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
        this.color = getColor();
    }

    @Override
    public void draw(Displayable displayable) {
        Line line1 = new Line(this.p2,this.p1, this.color);
        Line line2 = new Line(this.p2,this.p3, this.color);
        Line line3 = new Line(this.p3,this.p1, this.color);
        line1.draw(displayable);
        line2.draw(displayable);
        line3.draw(displayable);
    }
}
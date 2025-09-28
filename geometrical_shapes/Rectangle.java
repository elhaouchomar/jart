package geometrical_shapes;
import java.awt.Color;

public class Rectangle implements Drawable {
    Point Rec1;
    Point Rec2;
    Color color;
    public Rectangle(Point x, Point y){
        this.Rec1 = x;
        this.Rec2 = y;
        this.color =getColor();
    }
    public void draw(Displayable d){
        Point bdya = new Point(this.Rec1.x, this.Rec2.y);
        Point tania =new Point(this.Rec2.x, this.Rec1.y);
        Point talt = new Point(bdya.x, this.Rec2.y);
        Point rb3a = new Point(tania.x, this.Rec2.y);

        Line line1 = new Line(this.Rec1, bdya,color);
        Line line2 = new Line(this.Rec1, tania,color);
        Line line3 = new Line(bdya, this.Rec2,color);
        Line line4 = new Line(this.Rec2, tania,color);

        line1.draw(d);
        line2.draw(d);
        line3.draw(d);
        line4.draw(d);
    }
}

package geometrical_shapes;

import java.awt.Color;

public class Line implements Drawable {
    private Point start;
    private Point end;
    Color color;

    public Line() {
        this.start = new Point();
        this.end = new Point();
        this.color = getColor();
    }

    public Line(Point start, Point end, Color color) {
        this.start = start;
        this.end = end;
        this.color = color;
    }

    public Point getStart() {
        return this.start;
    }

    public Point getEnd() {
        return this.end;
    }

    @Override
    public void draw(Displayable displayable) {

        int step = Math.max(
            Math.abs(this.start.x - this.end.x),
            Math.abs(this.start.y - this.end.y)
        );

        if (step == 0) {
            displayable.display(this.start.x, this.start.y, color);
            return;
        }

        float heightX = (float)(this.start.x - this.end.x) / step;
        float heightY = (float)(this.start.y - this.end.y) / step;

        float x = this.end.x;
        float y = this.end.y;

        for (int i = 0; i < step; i++) {
            displayable.display(Math.round(x), Math.round(y), color);
            x += heightX;
            y += heightY;
        }

    }
}

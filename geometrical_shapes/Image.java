package geometrical_shapes;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Image implements Displayable {
    private int Width;
    private int Height;
    public BufferedImage image;

    public Image(int y, int x) {
        try {
            this.Width = x;
            this.Height = y;
            this.image = new BufferedImage(y, x, BufferedImage.TYPE_INT_RGB);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int getWidth() {
        return this.Width;
    }

    public int getHeight() {
        return this.Height;
    }

    public void save(String filePath) {
        try {
            File outputFile = new File(filePath);
            ImageIO.write(image, "PNG", outputFile);
            System.out.println("Image successfully saved as PNG to: " + filePath);
        } catch (IOException e) {
            System.err.println("Error saving image: " + e.getMessage());
        }
    }

    public void display(int x, int y, Color color) {
        if (x < 0 || y < 0)
            return;
        if (x >= this.Width || y >= this.Height)
            return;
        image.setRGB(x, y, color.getRGB());
    }

}

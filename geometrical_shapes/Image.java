package geometrical_shapes;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Image implements Displayable {
    private int width, height;
    public BufferedImage image;

    public Image(int width, int height) {
        this.width = width;
        this.height = height;
        image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    }

    public int getWidth() { return width; }
    public int getHeight() { return height; }

    @Override
    public void display(int x, int y, Color color) {
        if (x < 0 || y < 0 || x >= width || y >= height) return;
        image.setRGB(x, y, color.getRGB());
    }

    @Override
    public void save(String filePath) {
        try {
            ImageIO.write(image, "PNG", new File(filePath));
            System.out.println("Saved image: " + filePath);
        } catch (IOException e) {
            System.err.println("Error saving image: " + e.getMessage());
        }
    }
}

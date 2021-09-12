import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Car extends Canvas {
	public int x = 0;
	public int y = 0;
	public BufferedImage image;
	
	public Car(int x, int y) {
		this.x = x; this.y = y;
		try {
			image = ImageIO.read(new File("car.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

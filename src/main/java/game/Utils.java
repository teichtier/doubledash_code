package game;

import javafx.scene.image.Image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

/**
 * @since 16.11.2015
 */
public class Utils {

    public static BufferedImage loadImage(String name) throws Exception {
        return ImageIO.read(Utils.class.getResourceAsStream("/images/" + name));
    }

    public static Image loadJavaFxImage(String name) throws Exception {
        return new Image(Utils.class.getResourceAsStream("/images/" + name));
    }
}

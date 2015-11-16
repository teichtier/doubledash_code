import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

/**
 * @since 16.11.2015
 */
public class Utils {

    public static BufferedImage loadImage(String name) throws Exception {
        return ImageIO.read(Utils.class.getResourceAsStream("/images/" + name));
    }
}

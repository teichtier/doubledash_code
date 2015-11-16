import game.CharacterType;
import game.Utils;
import javafx.scene.image.Image;
import org.junit.Test;

import java.awt.image.BufferedImage;

import static org.junit.Assert.*;

/**
 * @since 16.11.2015
 */
public class UtilsTest {

    @Test
    public void testLoading() throws Exception {
        BufferedImage image = Utils.loadImage(CharacterType.GANDALF.getSpriteName());
        assertNotNull(image);
        assertEquals(64, image.getWidth());
        assertEquals(64, image.getHeight());
    }

    @Test
    public void testJavaFxLoading() throws Exception {
        Image image = Utils.loadJavaFxImage(CharacterType.GANDALF.getSpriteName());
        assertNotNull(image);
        assertEquals(64, image.getWidth(),0.0);
        assertEquals(64, image.getHeight(),0.0);
    }
}
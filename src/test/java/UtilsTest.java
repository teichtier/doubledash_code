import game.CharacterType;
import game.Utils;
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
}
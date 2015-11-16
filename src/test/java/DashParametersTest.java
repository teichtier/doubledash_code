import game.DashParameters;
import org.junit.Test;

/**
 * @since 16.11.2015
 */
public class DashParametersTest {

    @Test
    public void testBuilding() throws Exception {

        String[] args = {
            "char",
            "RAMBO",
            "weapon",
            "KNIFE",
            "multiplayer",
            "y"
        };

        DashParameters.DashParametersBuilder builder = DashParameters.builder();
        builder.getValueOfParameter(args, "char").ifPresent(builder::character);
        builder.getValueOfParameter(args, "weapon").ifPresent(builder::weapon);
        builder.getValueOfParameter(args, "difficulty").ifPresent(builder::difficulty);
        builder.getValueOfParameter(args, "language").ifPresent(builder::langType);
        builder.getValueOfParameter(args, "multiplayer").ifPresent(s -> {
            if (s.toLowerCase().equals("y"))
                builder.numberOfPlayers(2);
        });

        DashParameters build = builder.build();

        System.out.println(build);
    }
}
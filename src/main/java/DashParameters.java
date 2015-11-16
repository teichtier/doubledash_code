/**
 * @since 16.11.2015
 */
public class DashParameters {



    public static class DashParametersBuilder {
        private CharacterType characterType;
        private Difficulty difficulty;
        private Direction direction;
        private LangType langType;
        private NumberOfPlayers numberOfPlayers;

        private DashParametersBuilder() {
            this.characterType = CharacterType.RAMBO;
            this.difficulty = Difficulty.NORMAL;
            this.direction = Direction.Left2Right;
            this.langType = LangType.ENGLISH;
            this.numberOfPlayers = NumberOfPlayers.ONE;
        }
    }
}

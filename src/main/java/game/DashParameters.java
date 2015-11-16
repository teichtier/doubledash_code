package game;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @since 16.11.2015
 */
public class DashParameters {

    private final CharacterType characterType;
    private final Difficulty difficulty;
    private final Direction direction;
    private final LangType langType;
    private final NumberOfPlayers numberOfPlayers;
    private final WeaponType weaponType;

    private DashParameters(CharacterType characterType, Difficulty difficulty, Direction direction, LangType langType, NumberOfPlayers numberOfPlayers, WeaponType weaponType) {
        this.characterType = characterType;
        this.difficulty = difficulty;
        this.direction = direction;
        this.langType = langType;
        this.numberOfPlayers = numberOfPlayers;
        this.weaponType = weaponType;
    }

    public CharacterType getCharacterType() {
        return characterType;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public Direction getDirection() {
        return direction;
    }

    public LangType getLangType() {
        return langType;
    }

    public NumberOfPlayers getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    @Override
    public String toString() {
        return "game.DashParameters{" +
            "characterType=" + characterType +
            ", difficulty=" + difficulty +
            ", direction=" + direction +
            ", langType=" + langType +
            ", numberOfPlayers=" + numberOfPlayers +
            ", weaponType=" + weaponType +
            '}';
    }

    public static DashParametersBuilder builder() {
        return new DashParametersBuilder();
    }

    public static class DashParametersBuilder {
        private CharacterType characterType;
        private Difficulty difficulty;
        private Direction direction;
        private LangType langType;
        private NumberOfPlayers numberOfPlayers;
        private WeaponType weaponType;

        private DashParametersBuilder() {
            this.characterType = CharacterType.RAMBO;
            this.difficulty = Difficulty.NORMAL;
            this.direction = Direction.Left2Right;
            this.langType = LangType.ENGLISH;
            this.numberOfPlayers = NumberOfPlayers.ONE;
            this.weaponType = WeaponType.KNIFE;
        }

        public DashParametersBuilder character(String characterName) {
            this.characterType = CharacterType.valueOf(characterName.toUpperCase());
            return this;
        }

        public DashParametersBuilder difficulty(String difficultyName) {
            this.difficulty = Difficulty.valueOf(difficultyName.toUpperCase());
            return this;
        }

        public DashParametersBuilder direction(String directionName) {
            this.direction = Direction.valueOf(directionName.toUpperCase());
            return this;
        }

        public DashParametersBuilder langType(String languageName) {
            this.langType = LangType.valueOf(languageName);
            return this;
        }

        public DashParametersBuilder numberOfPlayers(int numberOfPlayers) {
            this.numberOfPlayers = NumberOfPlayers.get(numberOfPlayers);
            return this;
        }

        public DashParametersBuilder weapon(String weaponName) {
            this.weaponType = WeaponType.valueOf(weaponName.toUpperCase());
            return this;
        }

        public DashParameters build() {
            return new DashParameters(characterType, difficulty, direction, langType, numberOfPlayers, weaponType);
        }

        public Optional<String> getValueOfParameter(String[] params, String parameterName) {
            for (int i = 0; i < params.length; i++) {
                if (params[i].equals(parameterName)) {
                    if ((i + 1) >= params.length)
                        throw new RuntimeException("There is no value for " + parameterName);
                    else
                        return Optional.of(params[i + 1]);
                }
            }

            return Optional.empty();
        }

        public boolean isParameterPresent(String[] params, String parameterName) {
            return Stream.of(params).anyMatch(s -> s.equals(parameterName));
        }
    }
}

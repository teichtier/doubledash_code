package game;

/**
 * @since 16.11.2015
 */
public enum CharacterType {

    RAMBO(50, "rambo.png"),
    GANDALF(100, "gandalf.png");

    private final int hp;
    private final String spriteName;

    CharacterType(int hp, String spriteName) {
        this.hp = hp;
        this.spriteName = spriteName;
    }

    public int getHp() {
        return hp;
    }

    public String getSpriteName() {
        return spriteName;
    }
}

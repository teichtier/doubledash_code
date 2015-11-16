package game;

/**
 * @since 16.11.2015
 */
public enum WeaponType {
    BOW(10, 10, "bow.png"),
    KNIFE(100, 1, "knife.png")
    ;

    private final int damage;
    private final int range;
    private final String spriteName;

    WeaponType(int damage, int range, String spriteName) {
        this.damage = damage;
        this.range = range;
        this.spriteName = spriteName;
    }

    public int getDamage() {
        return damage;
    }

    public int getRange() {
        return range;
    }

    public String getSpriteName() {
        return spriteName;
    }
}

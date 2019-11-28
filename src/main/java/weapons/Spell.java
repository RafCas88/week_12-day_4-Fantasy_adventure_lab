package weapons;

public enum Spell {
    FIREBALL(5),
    LIGHTNINGSTRIKE(3),
    FIRECIRCLE(8),
    ICEBALL(10);

    private int damage;

    Spell(int damage) {
        this.damage = damage;

    }

    public int getDamage() {
        return this.damage;

    }
}




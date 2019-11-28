package enemies;

import players.Ifightable;
import weapons.Weapon;

public abstract class Enemy implements Ifightable {

    private String name;
    private Weapon weapon;
    private int health;

    public Enemy(String name, Weapon weapon, int health){

        this.name = name;
        this.weapon = weapon;
        this.health = health;

    }

    public int getHealth() {
        return health;
    }

    public String getName(){
        return name;
    }

    public void changeWeapon(Weapon newWeapon) {
        this.weapon = newWeapon;
    }

    public Weapon getWeapon(){
        return this.weapon;
    }
}

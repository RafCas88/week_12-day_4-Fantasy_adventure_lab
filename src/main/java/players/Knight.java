package players;


import Items.Treasure;
import enemies.Enemy;
import weapons.Weapon;

import java.util.ArrayList;

public class Knight extends Player implements Ifightable {

    private int armour;
    private ArrayList<Treasure> treasures;
    private Weapon weapon;

    public Knight(int armour, String name, int health, Weapon weapon){

        super(name, health);
        this.armour = armour;
        this.weapon = weapon;
        this.treasures = new ArrayList<Treasure>();
    }


    public Weapon getWeapon(){
        return this.weapon;
    }

    public int attack(Enemy enemy) {
        return enemy.getHealth() - this.weapon.getDamage();
    }

    public int defense(Enemy enemy) {
        return getHealth() - (enemy.getWeapon().getDamage() - this.armour);
    }

    public void changeWeapon(Weapon newWeapon) {
        this.weapon = newWeapon;
    }

}

package players;

import Items.Treasure;
import enemies.Enemy;
import weapons.Weapon;

import java.util.ArrayList;

public class Barbarian extends Player implements Ifightable {

    private int horseHealth;
    private ArrayList<Treasure> treasures;
    private Weapon weapon;

    public Barbarian(int horseHealth, Weapon weapon, String name, int health ){
        super(name, health);
        this.horseHealth = horseHealth;
        this.weapon = weapon;
        treasures = new ArrayList<Treasure>();
    }

    public int getHorseHealth(){
        return this.horseHealth;
    }

    public int attack(Enemy enemy) {
       return enemy.getHealth() - this.weapon.getDamage();
    }

    public int defense(Enemy enemy) {
       return getHealth() - enemy.getWeapon().getDamage();
    }

    public void changeWeapon(Weapon newWeapon) {
        this.weapon = newWeapon;
    }

}

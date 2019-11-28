package players;

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

    public String attack(Enemy enemy) {
        enemy.health - this.weapon.getDamage();
        return "You're gonna die pal";
    }

    public String defense(Enemy enemy) {
        getHealth() - (enemy.weapon.getDamage() - this.armour);
        return "Oh Boy";
    }

    public void changeWeapon(Weapon newWeapon) {
        this.weapon = newWeapon;
    }

}

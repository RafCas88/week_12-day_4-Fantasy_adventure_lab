package players;

import weapons.Weapon;

import java.util.ArrayList;

public class Dwarf extends Player implements Ifightable {

    private Weapon weapon;
    private int wineFlask;
    private ArrayList<Treasure> treasures;

    public Dwarf(Weapon weapon, int wineFlask, String name, int health){
        super(name, health);
        this.weapon = weapon;
        this.wineFlask = wineFlask;
        treasures = new ArrayList<Treasure>();
    }

    public int getWineFlask() {
        return wineFlask;
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

    public String drunkAttack(Enemy enemy){
        if (wineFlask > 0){
            enemy.health - (this.weapon.getDamage() + 2);
            wineFlask --;
        }
        return "Empty!!";
    }



}

package players;

import Items.Treasure;
import enemies.Enemy;
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

    public int attack(Enemy enemy) {
       return enemy.getHealth() - this.weapon.getDamage();
    }

    public int defense(Enemy enemy) {
       return getHealth() - enemy.getWeapon().getDamage();
    }

    public void changeWeapon(Weapon newWeapon) {
        this.weapon = newWeapon;
    }

    public int drunkAttack(Enemy enemy){
        if (wineFlask > 0){
            wineFlask --;
            return enemy.getHealth() - (this.weapon.getDamage() + 2);
        }
        return enemy.getHealth();
    }



}

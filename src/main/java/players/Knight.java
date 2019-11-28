package players;


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
        treasures = new ArrayList<Treasure>();
    }


    public String attack(Enemy enemy) {
        enemy.health - this.weapon.getDamage();
        return "I am going to kill you!";
    }

    public String defense(Enemy enemy) {
        getHealth() - (enemy.weapon.getDamage() - this.armour);
        return "OH LORD";
    }

    public void changeWeapon(Weapon newWeapon) {
        this.weapon = newWeapon;
    }

}

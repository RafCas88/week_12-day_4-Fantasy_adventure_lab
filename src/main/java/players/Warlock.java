package players;

import enemies.Enemy;
import weapons.Spell;

public class Warlock extends Player implements Ispell {

    private int creature;
    private Spell spell;

    public Warlock(int creature, String name, int health, Spell spell){

        super(name, health);
        this.spell = spell;
        this.creature = creature;
    }

    public Spell getSpell(){
        return this.spell;
    }


    public int castSpell(Enemy enemy) {
        return enemy.getHealth() - this.spell.getDamage();
    }

    public int useCreature(Enemy enemy) {
        return getHealth() - enemy.getWeapon().getDamage();
    }

    public void changeSpell(Spell newSpell) {
        this.spell = newSpell;

    }

    public void changeCreature(int newCreature) {
        this.creature = newCreature;
    }

    public int getCreature(){
        return this.creature;
    }
}

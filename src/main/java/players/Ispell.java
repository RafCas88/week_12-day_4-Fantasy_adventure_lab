package players;

import enemies.Enemy;
import weapons.Spell;

public interface Ispell {

    int castSpell(Enemy enemy);
    int useCreature(Enemy enemy);
    void  changeSpell(Spell newSpell);
    void changeCreature(int newCreature);

}

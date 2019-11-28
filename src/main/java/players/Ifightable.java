package players;

import enemies.Enemy;
import weapons.Weapon;

public interface Ifightable {

    int attack(Enemy enemy);
    int defense(Enemy enemy);
    void changeWeapon(Weapon newWeapon);
}

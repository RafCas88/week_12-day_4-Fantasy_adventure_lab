package players;

import weapons.Weapon;

public interface Ifightable {

    String attack(Enemy enemy);
    String defense(Enemy enemy);
    void changeWeapon(Weapon newWeapon);
}

import Items.Treasure;
import org.junit.Before;
import org.junit.Test;
import players.Knight;
import weapons.Weapon;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Treasure treasure;

    @Before
    public void before(){
        knight = new Knight(3, "Zsolt", 8, Weapon.SWORD);
        treasure = new Treasure("Gold", 10);
    }

    @Test
    public void hasName(){
        assertEquals("Zsolt", knight.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(8, knight.getHealth());
    }

    @Test
    public void hasWeapon(){
        assertEquals(Weapon.SWORD, knight.getWeapon());
    }

    @Test
    public void canGetTreasures(){
        assertEquals(0, knight.getNumberOfTreasure());
    }

    @Test
    public void canAddTreasure(){
        knight.addTreasure(treasure);
        assertEquals(1, knight.getNumberOfTreasure());
    }

}

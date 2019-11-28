import Items.Treasure;
import org.junit.Before;
import org.junit.Test;
import players.Cleric;
import players.Knight;
import weapons.Weapon;

import static org.junit.Assert.assertEquals;

public class ClericTest {


    Cleric cleric;
    Treasure treasure;
    Knight knight;

    @Before
    public void before(){

        cleric = new Cleric("Freezer", 10, 8);
        treasure = new Treasure("Gold", 10);
        knight = new Knight(10, "Charles", 15, Weapon.MACE);
    }

    @Test
    public void hasName(){
        assertEquals("Freezer", cleric.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(10, cleric.getHealth());
    }


    @Test
    public void canGetTreasures(){
        assertEquals(0, cleric.getNumberOfTreasure());
    }

    @Test
    public void canAddTreasure(){
        cleric.addTreasure(treasure);
        assertEquals(1, cleric.getNumberOfTreasure());
    }

    @Test
    public void canGetHealingPotion(){
        assertEquals(8, cleric.getHealingPotion());
    }

    @Test
    public void canHealPlayer(){
        assertEquals(23, cleric.healOtherPlayer(knight));
    }

    @Test
    public void canChangeHealingPotion(){
        cleric.changeHealingTool(5);
        assertEquals(5, cleric.getHealingPotion());
    }
}

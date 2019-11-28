import Items.Treasure;
import org.junit.Before;
import org.junit.Test;
import players.Warlock;
import weapons.Spell;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;
    Treasure treasure;

    @Before
    public void before(){
        warlock = new Warlock(6, "John", 8, Spell.ICEBALL);
        treasure = new Treasure("Gold", 10);
    }

    @Test
    public void hasName(){
        assertEquals("John", warlock.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(8, warlock.getHealth());
    }

    @Test
    public void hasSpell(){
        assertEquals(Spell.ICEBALL, warlock.getSpell());
    }

    @Test
    public void canGetTreasures(){
        assertEquals(0, warlock.getNumberOfTreasure());
    }

    @Test
    public void canAddTreasure(){
        warlock.addTreasure(treasure);
        assertEquals(1, warlock.getNumberOfTreasure());
    }

    @Test
    public void canChangeCreature(){
        warlock.changeCreature(4);
        assertEquals(4, warlock.getCreature());
    }
}

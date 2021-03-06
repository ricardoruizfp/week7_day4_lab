import Player.Cleric.Cleric;
import Player.Fighter.Barbarian;
import Player.Potion.HealingPotion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {
    Cleric cleric1;
    Barbarian barbarian1;
    HealingPotion healingPotion1;
    @Before
    public void before(){
        cleric1 = new Cleric("Cleric priest dude");
        healingPotion1 = new HealingPotion();
        barbarian1 = new Barbarian("Grognak");
    }

    @Test
    public void hasMedicine(){
        cleric1.setMedicine(healingPotion1);
        assertEquals(healingPotion1, cleric1.getMedicine());
    }

    @Test
    public void canUseMedicine(){
        cleric1.setMedicine(healingPotion1);
        cleric1.useMedicine(barbarian1);
        assertEquals(15, barbarian1.getHitPoints());
    }

}

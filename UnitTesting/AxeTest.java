package UnitTesting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AxeTest {
    private static final int AXE_ATTACK = 10;
    private static final int AXE_DURABILITY = 10;
    private static final int DUMMY_HEALTH = 10;
    private static final int DUMMY_XP = 10;

    private Axe axe;
    private Dummy dummy;
    private Axe brokenAxe;

    @Before
    public void setUp(){
        this.axe = new Axe(AXE_ATTACK, AXE_DURABILITY);
        this.brokenAxe = new Axe(AXE_ATTACK, 0);
        this.dummy = new Dummy(DUMMY_HEALTH, DUMMY_XP);
    }

    @Test
    public void axeAttacksLosesDurability() {
        axe.attack(dummy);
    }

    @Test(expected = IllegalStateException.class)
    public void brokenAxeCantAttack() {
        brokenAxe.attack(dummy);
    }
}
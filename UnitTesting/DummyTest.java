package UnitTesting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyTest {
    private static final int HEALTH = 10;
    private static final int XP = 10;
    private static final int ATTACK_POINTS = 1;
    private Dummy dummy;
    private Dummy deadDummy;

    @Before
    public void setUp() {
        this.dummy = new Dummy(HEALTH, XP);
        this.deadDummy = new Dummy(0, XP);
    }
    @Test
    public void dummyLosesHealthAfterAttack(){
        dummy.takeAttack(ATTACK_POINTS);
        assertEquals(HEALTH - ATTACK_POINTS, dummy.getHealth());
    }

    @Test(expected = IllegalStateException.class)
    public void deadDummyThrowsExceptionIfAttacked(){
        deadDummy.takeAttack(ATTACK_POINTS);
    }

    @Test
    public void deadDummyCanGiveXP(){
        int actual = deadDummy.giveExperience();
        assertEquals(actual, XP);
    }

    @Test(expected = IllegalStateException.class)
    public void aliveDummyCantGiveXp(){
        dummy.giveExperience();
    }
}
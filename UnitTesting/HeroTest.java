package UnitTesting;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class HeroTest {
    Hero hero;

    @Before
    public void setUp(){
        Weapon fakeWeapon = Mockito.mock(Weapon.class);
        this.hero = new Hero("SuperMario", fakeWeapon);
    }

    @Test
    public void ifHeroGainsXPWhenTargetDies(){
        Target fakeTarget = Mockito.mock(Target.class);
        Mockito.when(fakeTarget.isDead()).thenReturn(true);
        Mockito.when(fakeTarget.giveExperience()).thenReturn(100);
        this.hero.attack(fakeTarget);
        assertEquals(100, hero.getExperience());
    }

}
package ReflectionAndAnnotations.Exercise.BarracksWarsANewFactory.barracksWars;

import ReflectionAndAnnotations.Exercise.BarracksWarsANewFactory.barracksWars.interfaces.Repository;
import ReflectionAndAnnotations.Exercise.BarracksWarsANewFactory.barracksWars.interfaces.Runnable;
import ReflectionAndAnnotations.Exercise.BarracksWarsANewFactory.barracksWars.interfaces.UnitFactory;
import ReflectionAndAnnotations.Exercise.BarracksWarsANewFactory.barracksWars.core.Engine;
import ReflectionAndAnnotations.Exercise.BarracksWarsANewFactory.barracksWars.core.factories.UnitFactoryImpl;
import ReflectionAndAnnotations.Exercise.BarracksWarsANewFactory.barracksWars.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
/*
add Pikeman
add Pikeman
add Gunner
add Horseman
add Archer
add Gunner
add Gunner
add Horseman
report
fight
 */
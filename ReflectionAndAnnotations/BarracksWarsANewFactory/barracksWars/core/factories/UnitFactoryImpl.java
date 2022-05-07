package ReflectionAndAnnotations.Exercise.BarracksWarsANewFactory.barracksWars.core.factories;

import ReflectionAndAnnotations.Exercise.BarracksWarsANewFactory.barracksWars.interfaces.Unit;
import ReflectionAndAnnotations.Exercise.BarracksWarsANewFactory.barracksWars.interfaces.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"ReflectionAndAnnotations.Exercise.BarracksWarsANewFactory.barracksWars.models.units.";

	@Override
	public Unit createUnit(String unitType)  {

		Class unitClass = null;
		try {
			unitClass = Class.forName(UNITS_PACKAGE_NAME + unitType);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Constructor<Unit> constructor = null;
		try {
			constructor = unitClass.getDeclaredConstructor();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		try {
			return constructor.newInstance();
		} catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}

		return null;
	}
}

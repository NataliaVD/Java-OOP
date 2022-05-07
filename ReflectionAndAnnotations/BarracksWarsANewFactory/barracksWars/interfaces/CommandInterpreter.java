package ReflectionAndAnnotations.Exercise.BarracksWarsANewFactory.barracksWars.interfaces;

public interface CommandInterpreter {

	Executable interpretCommand(String[] data, String commandName);
}

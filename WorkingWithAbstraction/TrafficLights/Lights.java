package WorkingWithAbstraction.Exercise.TrafficLights;

public enum Lights {
    RED("GREEN"),
    GREEN("YELLOW"),
    YELLOW("RED");

    private String color;

    Lights(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

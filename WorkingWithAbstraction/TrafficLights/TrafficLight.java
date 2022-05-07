package WorkingWithAbstraction.Exercise.TrafficLights;

public class TrafficLight {
    Lights light;

    public TrafficLight(Lights light) {
        this.light = light;
    }

    public Lights getLight() {
        return light;
    }

    public void changeColor(){
        this.light = Lights.valueOf(light.getColor());
    }
}

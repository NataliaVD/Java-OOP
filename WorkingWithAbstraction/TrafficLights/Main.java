package WorkingWithAbstraction.Exercise.TrafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lights = scanner.nextLine().split("\\s+");
        int rounds = Integer.parseInt(scanner.nextLine());

        List<TrafficLight> trafficLights = new ArrayList<>();
        for (String light : lights) {
            TrafficLight trafficLight = new TrafficLight(Lights.valueOf(light));
            trafficLights.add(trafficLight);
        }

        for (int i = 0; i < rounds; i++) {
            trafficLights.forEach(trafficLight -> trafficLight.changeColor());
            trafficLights.forEach(trafficLight -> System.out.print(trafficLight.light + " "));
            System.out.println();
        }
    }
}
/*
GREEN RED YELLOW
4
 */
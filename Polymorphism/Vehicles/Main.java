package Polymorphism.Exercise.Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carInput = scanner.nextLine().split("\\s+");
        Car car = new Car(Double.parseDouble(carInput[1]), Double.parseDouble(carInput[2]));

        String[] truckInput = scanner.nextLine().split("\\s+");
        Truck truck = new Truck(Double.parseDouble(truckInput[1]), Double.parseDouble(truckInput[2]));

        int lines = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < lines; i++) {
            String[] commandsInput = scanner.nextLine().split("\\s+");
            String command = commandsInput[0];
            String vehicle = commandsInput[1];
            switch (command){
                case "Drive":
                    driveVehicle(car, truck, commandsInput[2], vehicle);
                    break;
                case "Refuel":
                    refuelVehicle(car, truck, commandsInput[2], vehicle);
                    break;
            }
        }
        System.out.println(car);
        System.out.println(truck);
    }

    private static void refuelVehicle(Car car, Truck truck, String s, String vehicle) {
        double litres = Double.parseDouble(s);
        if(vehicle.equals("Car")){
            car.refuel(litres);
        }else if(vehicle.equals("Truck")){
            truck.refuel(litres);
        }
    }

    private static void driveVehicle(Car car, Truck truck, String s, String vehicle) {
        double distance = Double.parseDouble(s);
        if(vehicle.equals("Car")){
            System.out.println(car.drive(distance));
        }else if(vehicle.equals("Truck")){
            System.out.println(truck.drive(distance));
        }
    }
}
/*
Car 30.4 0.4
Truck 99.34 0.9
5
Drive Car 500
Drive Car 13.5
Refuel Truck 10.300
Drive Truck 56.2
Refuel Car 100.2
 */
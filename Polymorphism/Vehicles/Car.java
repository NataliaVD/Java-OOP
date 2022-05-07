package Polymorphism.Exercise.Vehicles;

public class Car extends Vehicles {
    private static final double SUMMER_FUEL_CONSUMPTION_PERCENT = 0.9;

    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
        this.fuelConsumption += SUMMER_FUEL_CONSUMPTION_PERCENT;
    }
}

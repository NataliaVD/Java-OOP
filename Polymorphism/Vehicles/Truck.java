package Polymorphism.Exercise.Vehicles;

public class Truck extends Vehicles{
    private static final double SUMMER_FUEL_CONSUMPTION_PERCENT = 1.6;
    private static final double REFUEL_PERCENT = 0.95;
    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
        this.fuelConsumption += SUMMER_FUEL_CONSUMPTION_PERCENT;
    }

    @Override
    public void refuel(double litre){
        fuelQuantity += (litre * REFUEL_PERCENT);
    }
}

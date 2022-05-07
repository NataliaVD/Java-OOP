package Polymorphism.Exercise.Vehicles;

import java.text.DecimalFormat;

public class Vehicles {
    protected double fuelQuantity;
    protected double fuelConsumption;

    public Vehicles(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public String drive(double distance){
        double neededFuel = distance * this.fuelConsumption;
        if (neededFuel > this.fuelQuantity) {
            //принтираме, че нямаме достатъчно гориво
            return String.format("%s needs refueling", this.getClass().getSimpleName());
        }
        this.fuelQuantity = this.fuelQuantity - neededFuel;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        return String.format("%s travelled %s km", this.getClass().getSimpleName(), decimalFormat.format(distance));
    }

    public void refuel(double litre){
        this.fuelQuantity += litre;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuelQuantity);
    }
}

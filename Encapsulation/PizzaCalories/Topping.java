package Encapsulation.Exercise.PizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        switch(toppingType) {
            case "Meat":
            case "Veggies":
            case "Cheese":
            case "Sauce":
                this.toppingType = toppingType;
                break;
            default:
                throw new IllegalArgumentException("Cannot place " + toppingType + " on top of your pizza.");
        }
    }

    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 50) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException(this.toppingType + " weight should be in the range [1..50].");
        }
    }

    public double calculateCalories(){
        double toppingTypeCalories = 0;
        switch (this.toppingType){
            case "Meat":toppingTypeCalories = 1.2;
                break;
            case "Veggies":toppingTypeCalories = 0.8;
                break;
            case "Cheese":toppingTypeCalories = 1.1;
                break;
            case "Sauce":toppingTypeCalories = 0.9;
                break;
        }
        return 2 * this.weight * toppingTypeCalories;
    }
}

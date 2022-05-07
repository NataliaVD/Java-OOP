package Encapsulation.Exercise.PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputPizza = scanner.nextLine().split("\\s+");
        String pizzaName = inputPizza[1];
        int toppingsNumber = Integer.parseInt(inputPizza[2]);
        Pizza pizza = new Pizza(pizzaName, toppingsNumber);

        String[] inputDough = scanner.nextLine().split("\\s+");
        String flourType = inputDough[1];
        String bakingTechnics = inputDough[2];
        double doughWeight = Double.parseDouble(inputDough[3]);
        Dough dough = new Dough(flourType, bakingTechnics, doughWeight);
        pizza.setDough(dough);

        String inputTopping = scanner.nextLine();
        while (!inputTopping.equals("END")){
            String toppingType = inputTopping.split("\\s+")[1];
            double toppingWeight = Double.parseDouble(inputTopping.split("\\s+")[2]);
            Topping topping = new Topping(toppingType, toppingWeight);
            pizza.addTopping(topping);

            inputTopping = scanner.nextLine();
        }

        System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());
    }
}
/*
Pizza Meatless 2
Dough Wholegrain Crispy 100
Topping Veggies 50
Topping Cheese 50
END
 */
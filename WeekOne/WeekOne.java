package WeekOne;

import java.util.ArrayList;

public class WeekOne {
    private ArrayList<String> orderedFood;
    private ArrayList<Integer> orderedQuantity;

    public WeekOne() {
        // ArrayList Created here
        orderedFood = new ArrayList<String>();
        orderedQuantity = new ArrayList<Integer>();

    }

    private double totalCost;

    public double getTotal() {
        return totalCost;
    }

    public void adddOrder(String meal, int quantity, String[] dish, double[] cost) {
        orderedFood.add(meal);
        orderedQuantity.add(quantity); // autoboxing done here
        for (int i = 0; i < dish.length; i++) {
            if (meal.equals(dish[i])) {
                // totalCost is initialized to be zero
                // whene a Bill instance is constructed
                totalCost += quantity * cost[i];
            }
        }
    }

    public void getOrder() {
        for (int i = 0; i < orderedFood.size(); i++) {
            System.out.println(orderedFood.get(i) + " " + orderedQuantity.get(i));

        }
    }
}

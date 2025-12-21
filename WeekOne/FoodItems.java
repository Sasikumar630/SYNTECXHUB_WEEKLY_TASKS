package WeekOne;

public class FoodItems {
    public static void main(String[] args) {
        // dish and cost are in same order
        String[] dish = { "Dosa", "coffee", "EggDosa", "Idly", "puri" };
        double[] cost = { 20, 15, 30, 5, 25 };
        WeekOne myWeekOne = new WeekOne();
        // pass copies of array reference
        System.out.println("WELCOME TO LOCAL RESTAURANT");
        System.out.println("Menu dosa:20 coffee:15 Eggdosa:30 Idly:5 puri:25");
        myWeekOne.adddOrder("Dosa", 2, dish, cost);
        myWeekOne.adddOrder("EggDosa", 2, dish, cost);
        myWeekOne.adddOrder("Idly", 3, dish, cost);
        myWeekOne.adddOrder("coffee", 1, dish, cost);
        myWeekOne.adddOrder("puri", 2, dish, cost);
        myWeekOne.getOrder();
        System.out.println("Total Cost :" + myWeekOne.getTotal());
    }

}

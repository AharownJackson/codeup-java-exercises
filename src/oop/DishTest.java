package oop;

import static oop.DishTools.flipRecommendation;
import static oop.DishTools.shoutDishName;

public class DishTest {

    public static void main(String[] args) {

        Dish dish1 = new Dish("Maryland Oysters", 100, true);
        Dish dish2 = new Dish("Steak Special", 1599, true);
        Dish dish3 = new Dish("The Litter", 663, true);

        dish1.printSummary();
        dish2.printSummary();
        dish3.printSummary();

        System.out.printf("My favorite dish is %s", shoutDishName(dish3));

//        dish3.flipRecommendation();

//        System.out.println(dish3.wouldRecommend);

    }
}

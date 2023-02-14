package oop;

import static oop.DishTools.flipRecommendation;
import static oop.DishTools.shoutDishName;

public class DishTest {

    public static void main(String[] args) {

        Dish dish1 = new Dish();
        dish1.costInCents = 100;
        dish1.nameOfDish = "Maryland Oyster";
        dish1.wouldRecommend = true;

        Dish dish2 = new Dish();
        dish2.costInCents = 863;
        dish2.nameOfDish = "The Litter";
        dish2.wouldRecommend = true;

        Dish dish3 = new Dish();
        dish3.costInCents = 500;
        dish3.nameOfDish = "Hot Joy: Wednesday Wing Special";
        dish3.wouldRecommend = true;


       dish1.printSummary();
       dish2.printSummary();
       dish3.printSummary();

        System.out.printf("My favorite dish is %s", shoutDishName(dish2));

        dish3.flipRecommendation();

//        System.out.println(dish3.wouldRecommend);

    }
}

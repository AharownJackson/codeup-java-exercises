package oop;

public class DishTest {

    public static void main(String[] args) {

        Dish dish1 = new Dish();
        dish1.costInCents = 100;
        dish1.nameOfDish = "Maryland Oyster";
        dish1.wouldRecommend = true;


       dish1.printSummary();

    }
}

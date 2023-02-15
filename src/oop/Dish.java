package oop;

public class Dish {

    private float costInCents;
    private String nameOfDish;
    private Boolean wouldRecommend;

    public void printSummary () {
        System.out.printf("""
                Cost: $%.2f
                Name: %s
                Recommended: %s
                ==========
                """, costInCents, nameOfDish, wouldRecommend);
    }


//    constructors

    public Dish (String name, float cents,  Boolean recommended) {
        this.nameOfDish = name;
        this.costInCents = cents / 100;
        this.wouldRecommend = recommended;
    }
    public Dish (String name, Boolean recommended) {
        this.nameOfDish = name;
        this.wouldRecommend = recommended;
        this.costInCents = 0;
    }
    public Dish (String name, float cents) {
        this.nameOfDish = name;
        this.costInCents = cents /100;
    }
    public Dish (String name) {
        this.nameOfDish = name;
        this.costInCents = 0;
    }

//    getters and setters

    public float getCostInCents() { return this.costInCents; }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public String getNameOfDish() {
        return this.nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public Boolean getWouldRecommend() {
        return this.wouldRecommend;
    }

    public void setWouldRecommend(Boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }
}


//    Create a class called Dish. This class will represent various restaurant dishes.
//        Include an integer property called “costInCents”
//        Include a string property called “nameOfDish”
//        Include a boolean property called “wouldRecommend”
//        Include a method called “printSummary” with a void return type
//        this method will use a single printf method to print out the values of each of the instance properties in the following format:
//        Cost: COST_IN_CENTS_HERE
//        Name: NAME_OF_DISH_HERE
//        Recommended: BOOLEAN_VALUE_OF_WOULD_RECOMMEND_HERE
//        Create another class called DishTest
//        Add a main method and inside the method...
//        1) instantiate a Dish object and assign to a variable called dish1
//        2) assign creative values for each of the properties
//        3) test the printSummary() method by invoking it and checking if all instance values are correctly printed








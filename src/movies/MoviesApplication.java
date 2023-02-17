package movies;

import utils.Input;

import java.util.Arrays;

import static movies.MoviesArray.findAll;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("""
                Please choose an option:
                ------------------------
                1 - view all
                2 - view by category
                """);
        int userMainInput = input.getInt();
        if(userMainInput == 2) {
            System.out.println("""
                    Please choose a category:
                    ------------------------
                    1 - view movies in the animated category
                    2 - view movies in the drama category
                    3 - view movies in the horror category
                    4 - view movies in the sci-fi category
                    5 - go back
                    """);
        } else {
            System.out.println(Arrays.toString(findAll()));
        }
        int userCategoryInput = input.getInt();


    }
}

package movies;

import utils.Input;

import static movies.MoviesArray.findAll;

public class Movie {
    private String name;
    private String category;

    // CONSTRUCTORS //
    public Movie() {
    }

    public Movie(String name) {
        this.name = name;
    }

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    // GETTERS / SETTERS //
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // METHODS //

    // runs the movie application //
    public static void runMoviesApp() {
        Input input = new Input();
        System.out.println("""
                Please choose an option:
                ------------------------
                1 - view all
                2 - view by category
                """);
        int userMainInput = input.getInt();
        if (userMainInput == 2) {
            generateCategories();
        } else {
            Movie[] userChoice = findAll();
            for (Movie movie : userChoice) {
                System.out.println(movie.getName());
                System.out.println("Continue?");
                boolean userInput = input.yesNo();
                if (userInput) {
                    runMoviesApp();
                }
            }
        }
    }

    // generates the movie category search menu and functionality //
    public static void generateCategories() {
        Input input = new Input();
        System.out.println("""
                Please choose a category:
                ------------------------
                1 - animated
                2 - drama
                3 - horror
                4 - sci-fi
                5 - go back
                """);
        int userInt = input.getInt();
        if (userInt == 1) {
            Movie[] userChoice = findAll();
            for (Movie movie : userChoice) {
                if (movie.category.equals("animated")) {
                    System.out.println(movie.getName());
                    System.out.println("Continue?");
                    boolean userInput = input.yesNo();
                    if (userInput) {
                        runMoviesApp();
                    }
                }
            }
        }
        if (userInt == 2) {
            Movie[] userChoice = findAll();
            for (Movie movie : userChoice) {
                if (movie.category.equals("drama")) {
                    System.out.println(movie.getName());
                    System.out.println("Continue?");
                    boolean userInput = input.yesNo();
                    if (userInput) {
                        runMoviesApp();
                    }
                }
            }
        }
        if (userInt == 3) {
            Movie[] userChoice = findAll();
            for (Movie movie : userChoice) {
                if (movie.category.equals("horror")) {
                    System.out.println(movie.getName());
                    System.out.println("Continue?");
                    boolean userInput = input.yesNo();
                    if (userInput) {
                        runMoviesApp();
                    }
                }
            }
        }
        if (userInt == 4) {
            Movie[] userChoice = findAll();
            for (Movie movie : userChoice) {
                if (movie.category.equals("sci-fi")) {
                    System.out.println(movie.getName());
                    System.out.println("Continue?");
                    boolean userInput = input.yesNo();
                    if (userInput) {
                        runMoviesApp();
                    }
                }
            }
        }
        if (userInt == 5) {
            runMoviesApp();
        }
    }

}





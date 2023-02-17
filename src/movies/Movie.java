package movies;

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
//    public static


}

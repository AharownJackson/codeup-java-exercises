import java.util.PrimitiveIterator;

public class Product {
    private String name;
    private double costInCents;


    // CONSTRUCTORS //
    public Product() {

    }

    public Product(String name, double costInCents) {
        this.name = name;
        this.costInCents = costInCents;
    }

    public Product(String name) {
        this.name = name;
    }

    public Product(double costInCents) {
        this.name = "Name Unassigned";
        this.costInCents = costInCents;
    }

    // GETTERS AND SETTERS //


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(double costInCents) {
        this.costInCents = costInCents;
    }

    // METHODS //
    public static double getAverage(Product[] items) {
        double total = 0;
        for(Product product : items) {
            total += product.costInCents;
        }
        return total / items.length;
    }

    // VIEWPORT //
    public static void main(String[] args) {

        Product[] items = new Product[4];
        items[0] = new Product("GameBoy", 4999);
        items[1] = new Product("Ps4", 39999);
        items[2] = new Product("Steak Special", 1599);
        items[3] = new Product("Adventure Canoe", 250000);

        double productAverage = Product.getAverage(items);
        System.out.printf("""
                The average cost of these items is: $%.2f
                """, productAverage);

    }

}

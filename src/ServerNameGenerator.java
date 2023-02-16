public class ServerNameGenerator {
    public static String[] adjectives = new String[] {
            "Fast",
            "Dirty",
            "Red",
            "Crazy",
            "Dangerous",
            "Moist",
            "Absurd",
            "Savage",
            "Toxic",
            "Stupid"
    };

    public static String[] nouns = new String[] {
            "German Shepard",
            "Fire Truck",
            "Olympics",
            "Adventure Canoe",
            "Apple Watch",
            "Water Bottle",
            "Lunch Box",
            "Toilet Paper",
            "Blue Light glasses",
            "Coyote"
    };

    // METHODS //

    // returns a random element from a given array //
    public static String getRandomWord(String[] words) {
        int randomNumber =  (int) (Math.random() * words.length);
        return words[randomNumber];

    }
}


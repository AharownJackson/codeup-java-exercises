import utils.Input;

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
            "German-Shepard",
            "Fire-Truck",
            "Olympics",
            "Adventure-Canoe",
            "Apple-Watch",
            "Water-Bottle",
            "Lunch-Box",
            "Toilet-Paper",
            "Blue-Light-glasses",
            "Coyote"
    };

    // METHODS //

    // returns a random element from a given array //
    public static String getRandomWord(String[] words) {
        int randomNumber =  (int) (Math.random() * words.length);
        return words[randomNumber];
    }

    public static String serverNameGenerator() {
        Input input = new Input();
        System.out.println("Do you want to generate a randomized server name?");
        boolean userCont = input.yesNo();
        String wordOne = null;
        String wordTwo = null;
        String serverName = null;
        if (userCont) {
            wordOne = getRandomWord(adjectives);
            wordTwo = getRandomWord(nouns);
            serverName = wordOne + "-" + wordTwo;
        }
        return serverName;
    }

    public static void main(String[] args) {
        String userServerName = serverNameGenerator();

        System.out.printf("""
                Here is your server name:
                %s
                """, userServerName);


    }
}


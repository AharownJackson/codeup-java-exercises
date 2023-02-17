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

    public static String makeName() {
        Input input = new Input();
        String wordOne = getRandomWord(adjectives);
        String wordTwo = getRandomWord(nouns);
        String serverName = wordOne + "-" + wordTwo;
        System.out.printf("""
                Your server name is: %s
                Do you like this name?
                """, serverName);
        boolean userCont = input.yesNo();
        if(!userCont) {
            return makeName();
        }
        return serverName;
    }

    public static String serverNameGenerator() {
        Input input = new Input();
        System.out.println("Generate a randomized server name: ");
        boolean userCont = input.yesNo();
        String serverName = null;
        if (userCont) {
            serverName = makeName();
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


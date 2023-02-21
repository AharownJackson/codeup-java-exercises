package media;

abstract public class Media {


    // METHODS //

    // can be done to every form of media //
    public static void checkedOut() {
        boolean checkedOut = false;
        if (checkedOut) {
            System.out.println("Es tut mir lied, this item is checked out.");
        } else {
            System.out.println("Super, this item is available to check out, enjoy!");
        }
    }


    // needs to be declared for every form of media extended from this class //
    abstract public void deviceNeeded();

    abstract public void materialMadeOf();

    abstract public void demolish();
}

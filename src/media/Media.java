package media;

abstract public class Media {

    protected boolean adultOnly;
    protected boolean checkedOut;
    protected String name;


    // CONSTRUCTORS //

    public Media() {
        this.checkedOut = false;
    }



    // METHODS //

    // can be done to every form of media //
    public void checkedOut() {
        if (checkedOut) {
            System.out.println("Es tut mir lied, this item is checked out.");
        } else {
            System.out.println("Super, this item is available to check out, enjoy!");
        }
    }

    public boolean isAdultOnly() {
       return adultOnly;
    }

    public void changeAdultOnly() {
        adultOnly = !adultOnly;
    }


    // needs to be declared for every form of media extended from this class //
    abstract public void deviceNeeded();

    abstract public void materialMadeOf();

    abstract public void demolish();
}

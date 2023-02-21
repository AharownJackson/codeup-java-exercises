package media;

import java.util.Date;

abstract public class Media {

    protected boolean adultOnly;
    protected boolean checkedOut;
    protected String name;
    protected Date lastScan;

    // CONSTRUCTORS //
    public Media() {
        this.checkedOut = false;
    }

    // GETTERS / SETTERS //
    public void setAdultOnly(boolean adultOnly) {
        this.adultOnly = adultOnly;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setLastScan(Date lastScan) {
        this.lastScan = lastScan;
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

package media;

import java.util.Date;

public class Patron extends Person implements LibraryUtils {

    // CONSTRUCTORS //
    public Patron(String name) {
        this.name = name;
    }

    public Patron(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // METHODS //
    @Override
    public String identify() {
        return this.name;
    }

    @Override
    public Date getLastScan() {
        return this.lastScan;
    }

    @Override
    public void setLastScan(Date lastScan) {
        this.lastScan = lastScan;
    }
}

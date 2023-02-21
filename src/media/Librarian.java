package media;

import java.util.Date;

public class Librarian extends Person {

    // CONSTRUCTORS //
    public Librarian(String name) {
        this.name = name;
    }

    public Librarian(String name, int age) {
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

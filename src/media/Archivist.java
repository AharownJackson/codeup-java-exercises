package media;

import java.util.Date;

public class Archivist extends Person {

    // CONSTRUCTORS //
    public Archivist(String name) {
        this.name = name;
    }

    public Archivist(String name, int age) {
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

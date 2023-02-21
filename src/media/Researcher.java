package media;

import java.util.Date;

public class Researcher extends Person implements LibraryUtils {

    // CONSTRUCTORS //
    public Researcher(String name) {
        this.name = name;
    }

    public Researcher(String name, int age) {
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

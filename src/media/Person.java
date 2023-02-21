package media;

import java.util.Date;

abstract public class Person implements LibraryUtils{

    protected String name;
    protected int age;
    protected Date lastScan;

    // CONSTRUCTORS //
    public Person() {

    }

    // GETTERS / SETTERS //


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // METHODS //
    public abstract String identify();

    public abstract Date getLastScan();

    public void setLastScan(Date lastScan) {
        this.lastScan = lastScan;
    }

}

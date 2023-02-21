package media;

import java.util.Date;

abstract public class Person {

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

    public void setLastScan(Date lastScan) {
        this.lastScan = lastScan;
    }

}

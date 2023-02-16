import java.util.Arrays;

public class Person {
    private String name;
    private int age;



    // CONSTRUCTORS //

    public Person () {

    }

    public Person (String name) {
        this.name = name;
    }
    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }


    // GETTERS AND SETTERS //

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // METHODS //

    // says hello to the passed Person object //
    public void sayHello(){
        System.out.printf("""
                Hello, %s
                You are %d years old
                """, this.name, this.age);
    }

    // adds a person object to a Person array //
    public static Person[] addPerson(Person[] persons, Person person){
        Person[] personsPlusOne = new Person[persons.length + 1];
        for(int i = 0; i < persons.length; i += 1) {
            personsPlusOne[i] = persons[i];
        }
        personsPlusOne[personsPlusOne.length - 1] = person;
        persons = personsPlusOne;
        return persons;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {

        Person person1 = new Person("actionwashere", 33);
        Person person2 = new Person("nandothesavage");

        person1.sayHello();
        person2.sayHello();
        System.out.println(person1.getName());
        person1.setName("Nando");

        Person[] persons = new Person[3];
        persons[0] = new Person("actionwashere");
        persons[1] = new Person("Nando");
        persons[2] = new Person("Jona");

        System.out.println(Arrays.toString(persons));





    }
}

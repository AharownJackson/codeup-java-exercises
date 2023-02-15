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

    // PRINT A PERSON'S NAME //

    public void sayHello(){
        System.out.printf("""
                Hello, %s
                You are %d years old
                """, this.name, this.age);
    }


    public static void main(String[] args) {

        Person person1 = new Person("actionwashere", 33);
        Person person2 = new Person("nandothesavage");

        person1.sayHello();
        person2.sayHello();
        System.out.println(person1.getName());
        person1.setName("Nando");





    }
}

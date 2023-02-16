import java.util.Arrays;

public class ArraysExercises {
    
    
    // VIEWPORT //
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] persons = new Person[3];
        persons[0] = new Person("action");
        persons[1] = new Person("B");
        persons[2] = new Person("Robb");

        for(Person person : persons) {
            System.out.println(person.getName());
        }
        Person person4 = new Person("Bob");
//        persons.addPerson(persons, person4); - why isn't this working!

    }
}

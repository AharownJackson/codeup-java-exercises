import java.util.Arrays;

public class ArraysExercises {
    
    
    // VIEWPORT //
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person[] persons = new Person[3];
        persons[0] = new Person("action");
        persons[1] = new Person("B");
        persons[2] = new Person("robb");

        Person[] persons2 = new Person[3];
        persons2[0] = new Person("jona");
        persons2[1] = new Person("nando");
        persons2[2] = new Person("david");

        for(Person person : persons) {
            System.out.printf("""
                    %s
                    """, person.getName());
        }

        for(Person person : persons2) {
            System.out.printf("""
                    %s
                    """, person.getName());
        }

        System.out.println("===== adding person to array =====");
        persons = Person.addPerson(persons, new Person("sandy"));
        persons = Person.addPerson(persons, new Person("bob"));
        persons2 = Person.addPerson(persons2, new Person("vianca"));


        for(Person person : persons) {
            System.out.printf("""
                    %s
                    """, person.getName());
        }

        for(Person person : persons2) {
            System.out.printf("""
                    %s
                    """, person.getName());
        }



    }
}

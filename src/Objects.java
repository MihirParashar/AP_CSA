import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Objects {
    /*
    OOP (Object-Oriented Programming): The programming concept of
    organizing data into modifiable objects.

    CLASS: A blueprint or template for an object. It defines the
    *DATA* & *BEHAVIOR* through variables and methods.

    OBJECT: An instance of a class. An object is instantiated
    using the syntax: Class myClass = new Class();

    CONSTRUCTORS: A starting method for an object. It overrides
    the default method run when instantiating an object. Useful
    for classes with properties.

    ENCAPSULATION: The OOP concept of bundling data with the
    methods that modify it, and restricting other classes from
    directly accessing its data. This is done by keeping its
    variables private, but creating public methods to view and
    modify the data, AKA "getters" and "setters.
     */
    public static void main(String[] args) {
        //Instantiating objects
        Person someDude = new Person("Nathan", 32);
        Person someKid = new Person("Mike", 13);
        //Modifying age variable after instantation
        someKid.setAge(14);

        String[] names = new String[] {"John", "Timmy", "Steve", "Alex", "Charlie"};
        int[] ages = new int[] {15, 26, 31, 19, 62};
        for (int i = 0; i < names.length; i++) {
            Person person = new Person(names[i], ages[i]);
            System.out.println("NAME: " + person.getName() + " AGE: " + person.getAge());
        }
    }
}

class Person {
    //PROPERTIES
    private String name;
    private int age;

    //CONSTRUCTOR
    public Person(String setName, int setAge) {
        name = setName;
        age = setAge;
    }

    //ENCAPSULATION
    public void setAge(int newAge) {
        age = newAge;
    }

    public int getAge() {
        return age;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }
}

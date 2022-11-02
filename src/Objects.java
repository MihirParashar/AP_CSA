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

    ENCAPSULATION: A concept of OOP, prevents direct access of
    data by creating mutator methods (get/set) and keeping the
    actual variables private.
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
    String name;
    int age;

    //CONSTRUCTOR
    Person(String setName, int setAge) {
        name = setName;
        age = setAge;
    }

    //ENCAPSULATION
    void setAge(int newAge) {
        age = newAge;
    }

    int getAge() {
        return age;
    }

    void setName(String newName) {
        name = newName;
    }

    String getName() {
        return name;
    }
}

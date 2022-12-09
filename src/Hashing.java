import java.util.Objects;

public class Hashing {
    /*
    HASH FUNCTION: A function that maps data to a fixed ID.

    Hashing has many uses, including verifying downloads. You'll
    know a file is legit if its hash code matches the hash code
    of the original file.

    There are lots of possible ways to create a hash function,
    but they must follow 3 rules:

    1. The size of the hash returned must always be the same,
    regardless of the input.

    2. The same input should always lead to the same hash output.

    3. DIFFERENT inputs should (almost) never lead to the same hash output.
    It will always be possible for two different inputs to return the same
    hash code: this is called hash collision. It is rare, but it happens more
    often than you would think.

    Java has a default hashCode() method for all objects. However, objects
    with identical properties will not have the same hash code unless
    we override the hashCode() method and create our own hash using the
    object's properties.
     */

    public static void main(String[] args) {
        String stringA = "Hello World!";

        //Java has a default hash function for all Objects
        System.out.println(stringA.hashCode());

        Car carA = new Car("Toyota", 120);
        Car carB = new Car("Toyota", 120);
        Car carC = new Car("Ford", 150);
        System.out.println(carA.hashCode()); //Same
        System.out.println(carB.hashCode()); //Same
        System.out.println(carC.hashCode()); //Different
    }
}

class Car {
    private String model;
    private int maxSpeed;

    public Car(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    @Override
    //If we create our own hash using the properties
    //of the class, identical objects will return the
    //same hash code, which is what we want.
    public int hashCode() {
        return Objects.hash(model, maxSpeed);
    }

    @Override
    //Objects with the same properties have the
    //same hash code. Therefore, they are equal.
    //So, we can use hash codes to compare objects.
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Car)) {
            return false;
        }
        return hashCode() == o.hashCode();
    }
}

public class Polymorphism {
    /*
    The OOP concept that an object can take on multiple forms.
    There are many parts to this.
    1. All classes automatically extend from the Object class.
    2. Child classes can override parent methods by redefining them.
    3. Objects can be cast into any class that is a parent of it.
    However, you will only be able to call methods from that parent
    class unless you cast it back.
     */
    public static void main(String[] args) {
        //Upcasting dog instance into animal instance
        Animal animal = new Dog();
        animal.sayHi(); //This still works!
        //Even though the Dog class has this method defined,
        //We can't run it because we cast it into an animal.
        //dog.woof(); <--- This will not work

        //Check if animal is an instance of Dog.
        if (animal instanceof Dog) {
            //Casting it back into a dog.
            Dog dog = (Dog) animal;
            dog.woof();
        }

        //SHORTHAND
        if (animal instanceof Dog dog) {
            dog.woof();
        }
    }
}
class Animal {
    public void sayHi() {
        System.out.println("Hi!");
    }
}
class Dog extends Animal {
    public void woof() {
        System.out.println("Woof!");
    }
}

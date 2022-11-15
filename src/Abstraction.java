public class Abstraction {
    /*
    ABSTRACT CLASS: A class with methods declared,
    but some of them are abstract (empty). Any class
    inheriting from one MUST override all of its abstract
    methods. Abstract classes CANNOT be instantiated, only
    classes inherited from it can.

    INTERFACE: Conceptually, defines a shared boundary between
    two seperate components to exchange information. In Java,
    an interface is like an abstract class but even more flexible.
    ALL of its methods MUST be defined by , and a class can implement multiple
    interfaces. Interfaces are kind of like a contract, because all
    classes that implement it must implement the functionality defined.
     */

    public static void main(String[] args) {

        Shape rect = new Rectangle(10, 8);
        System.out.println("AREA: " + rect.area());
        System.out.println("PERIMETER: " + rect.perimeter());

        //Java knows that both AB and ABC implement Summable,
        //so either one can be instantiated as a Summable, and
        //we can call sum() on both.
        Summable mySum = new AB(10, 20);
        System.out.println(mySum.sum());

        mySum = new ABC(10, 20, 30);
        System.out.println(mySum.sum());
    }
}

abstract class Shape {
    public abstract double area();
    public abstract double perimeter();
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double setWidth, double setHeight) {
        width = setWidth;
        height = setHeight;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return (width + height) * 2;
    }
}

interface Summable {
    int sum();
}
interface Multipliable {
    int multiply();
}

class AB implements Summable, Multipliable {
    private int a;
    private int b;

    public AB(int setA, int setB) {
        a = setA;
        b = setB;
    }

    public int sum() {
        return a + b;
    }

    public int multiply() {
        return a * b;
    }
}

class ABC implements Summable, Multipliable {
    private int a;
    private int b;
    private int c;

    public ABC(int setA, int setB, int setC) {
        a = setA;
        b = setB;
        c = setC;
    }

    public int sum() {
        return a + b + c;
    }

    public int multiply() {
        return a * b * c;
    }
}
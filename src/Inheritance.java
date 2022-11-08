public class Inheritance {
    /*
    INHERITANCE: The concept of a class inheriting
    the traits of another class, like a parent-child
    relationship. Like any other class, a child class
    cannot access private properties from its parent.
    Inherited classes MUST call super() in their constructor.
    This runs the constructor of the parent class.
     */
    public static void main(String[] args) {
        Student student1 = new Student("Mark", 15, 1376);

        //This works even though we didn't define this method in Student class
        System.out.println("NAME: " + student1.getName());

        //This will work on Student objects but not Human objects
        System.out.println("ID: " + student1.getId());
    }
}
class Human {
    //Child classes cannot access these
    private String name;
    private int age;
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
class Student extends Human {
    private int id;
    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }
    public int getId() {
        return id;
    }
}


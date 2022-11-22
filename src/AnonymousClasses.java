public class AnonymousClasses {
    /*
    ANONYMOUS CLASSES: Implement interfaces or override methods of
    existing classes without creating a named class. Restraints:
    - Must extend another class or implement an interface
    - Doesn't have a constructor or name
     */

    public static void main(String[] args) {
        Person student = new Person("Mark", 36) {
            @Override
            public String getName() {
                return "Student";
            }
        };

        //Prints "Student"
        System.out.println(student.getName());
    }
}

public class Exceptions {
    /*
    EXCEPTIONS: Java throws exceptions when something
    goes wrong at runtime. We can catch exceptions before
    they are thrown using try/catch, and handle them
    ourselves based on the type of exception.

    We can also throw exceptions ourselves when necessary, and
    add messages to them. (e.g. when a null argument is passed)
    Exceptions are objects too, so we use the 'new' keyword!

    CHECKED EXCEPTIONS: MUST be caught or sent upwards by throwing
    it again, otherwise the program will crash. Caused by things
    out of the programmer's control, like a wrong file name inputted
    by the user
    EXAMPLES:
    IOException: Problem with taking or receiving input, like reading a file
    ClassNotFoundException: Method called on non-existent class

    UNCHECKED EXCEPTIONS: Don't have to be handled, usually occurs
    from a programmer error.
    EXAMPLES:
    ArrayIndexOutOfBoundsException: Index too large for the array
    NullPointerException: Trying to call methods on null objects
    IllegalArgumentException: Invalid argument passed to a method
    IllegalStateException: When a function is called at the wrong time

    ERRORS: When something goes seriously wrong, usually unexpected
    EXAMPLES:
    AssertionError: When assert statement is false
    StackOverflowError: Program ends up in an infinite loop
    that takes up too much memory
     */

    public static void main(String[] args) {
        try {
            Integer hi = null;
            System.out.println(hi.toString());
        } catch (NullPointerException e) {
            System.out.println("Variable is null!");
        }

        try {
            sayHello(null);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    static void sayHello(String name) {
        //If the name is null, throw an illegal argument exception
        if (name == null) {
            throw new IllegalArgumentException("Argument 'name' is null!");
        }
        System.out.println("Hello " + name);
    }
}

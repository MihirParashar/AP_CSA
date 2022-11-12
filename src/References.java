public class References {
    /*
    Variables store REFERENCES to objects, not the
    objects themselves. When you set a variable equal
    to another variable, you are not creating a copy
    of it, you are creating a copy of the reference
    which leads to the same object. This does NOT
    apply for primitive types (int, char, etc.)
     */

    public static void main(String[] args) {

        Example hello = new Example(); //Creating a new object and storing a REFERENCE to it
        Example helloCopy = hello; //Copying the reference
        helloCopy.value = 10; // Modifies the original object!
        System.out.println(hello.value);

        int num = 0;
        int numCopy = num; //Creates an actual copy
        numCopy = 10; //Does NOT modify num!
        System.out.println(num);

        Example ex = new Example();

        System.out.println("ORIGINAL: " + ex.value);
        addValue(ex); //Modifies the actual object!
        System.out.println("NEW: " + ex.value);
    }

    static void addValue(Example example) {
        example.value++;
    }
}

class Example {
    public int value = 0;
}

public class TypeInference {
    /*
    Since Java version 10, in SOME cases, you don't have to put
    the type when creating a variable! You can use the 'var'
    keyword similar to C# or JavaScript. The Java compiler will
    automatically determine the type of variable based on its value.

    Type inferences cannot be used in functions! Not in their return
    type or their parameters.
     */

    public static void main(String[] args) {
        //Java compiler will infer that this is a String.
        var name = "Anthony";
        //You can still modify the variable as usual.
        name = "Christian";

        //But you CANNOT change the inferred type once initialized.
        //name = 0; <--- This will cause an error
    }
}

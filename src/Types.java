public class Types {
    /*
    VARIABLES - Objects that store data.
    TYPES - The type of variable you want
    to store (e.g. int, double, boolean)
    PRIMITIVE TYPES - Types that are stored
    with only numbers behind the scenes.
    LITERALS - Actual data values.
     */
    public static void main(String[] args) {
        //PRIMITIVE TYPES
        int number = 10; //int stores integers
        double decimal = 1.056; //double stores decimals
        boolean isCorrect = true; //booleans store true or false
        char letter = 'a'; //chars store singular characters
        //Behind the scenes, chars are mapped to number values
        //by their decimal value. e.g. 'a' -> 97, 'b' -> 98
        letter = 97; //Also valid!

        //OPERATIONS
        int a = 5;
        a = a + 3; //Add to variables
        a += 3; //Shorthand, also works for:
        // subtraction (-=), multiplication (*=), division (/=)
        a++; //Shorthand of a += 1, also works for subtraction (a--)
    }
}

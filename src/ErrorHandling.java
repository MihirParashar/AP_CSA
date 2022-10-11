public class ErrorHandling {
    /*
    3 TYPES OF ERRORS:
    Checkstyle - When code is not formatted properly, e.g. extra spaces
    Compiler - When Java does not understand what you are trying to do,
    such as when you make typos or extra parentheses
    Runtime - Harder to notice because the compiler may not notice
    what's wrong. Usually due to a bug, e.g. wrong variable used.

    ASSERT: Tests if a condition is true or not. Throws an AssertionError
    if the condition evaluates to false. Useful for testing code.
    NOTE: Assert MUST be enabled in the run/debug options for it to work!
     */

    public static void main(String[] args) {
        //Won't do anything because the condition is true
        assert 1 > 0;

        //Will throw an AssertionError because the condition is false
        assert 0 > 10 : "0 is NOT greater than 10!";

        int[] myArray = new int[] {0, 1, 2, 3, 4};

        //Will not cause issues because index 2 is in array
        findItemInArray(myArray, 2);

        //Will throw AssertionError because index 5 is not in array
        findItemInArray(myArray, 5);
    }

    static int findItemInArray(int[] array, int index) {
        //If the index is not in the array's length, throw an AssertionError.
        assert index > 0 && index < array.length : "Index passed is not in the array's length!";
        return array[index];
    }
}

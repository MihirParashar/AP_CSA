public class Loops {
    /*
    LOOPS: A way to run a statement multiple times without repeating code.
    WHILE: Runs over and over UNTIL the condition stated is NOT met.
    FOR: Defines a variable, increments it through every iteration, and
    runs UNTIL the condition is NOT met. Useful for going through arrays
    and running a certain number of times.
     */
    public static void main(String[] args) {
        int[] myArray = {10, 21, 8, 17, 6};

        //WHILE syntax: while (condition)
        int num = 1;
        while (num <= 10) {
            //Will run repeatedly until num <= 10
            //Result: prints numbers 1-10
            System.out.println(num);
            num++;
        }

        //FOR syntax: for (variable; condition; increment)
        for (int i = 0; i < myArray.length; i++) {
            //Will go through every item in the array, and print it.
            System.out.println(myArray[i]);
        }

        //ENHANCED FOR LOOP, shorter version of for loop
        for (int item : myArray) {
            //Will go through every item in the array, and print it.
            System.out.println(item);
        }
    }
}

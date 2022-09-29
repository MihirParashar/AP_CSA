public class Conditionals {
    /*
        CONDITIONAL EXPRESSIONS: A statement that evaluates
        to a boolean value. e.g. (10 == 10) -> true (10 == 15) -> false
        IF STATEMENTS: Only run IF the specified condition or
        boolean is equal to true.
        == OPERATOR: Checks if one value is equal to another.
        != OPERATOR: Checks if one value is NOT equal to another.
        ! OPERATOR: Flips the value of any boolean value.
        e.g. !(10 == 10) -> false
     */
    public static void main(String[] args) {
        if (5 == 5) {
            //WILL run because the condition evaluates to true
            System.out.println("Yep!");
        }

        if (5 != 5) {
            //WILL NEVER run because the condition evaluates to false
            System.out.println("No!");
        }

        boolean isCool = true;
        if (isCool) {
            //WILL run because the boolean is true
            System.out.println("I'm cool!");
        }
    }
}

public class Conditionals {
    /*
    CONDITIONAL EXPRESSIONS: A statement that evaluates to a boolean
    value. e.g. (10 == 10) -> true (10 == 15) -> false
    IF STATEMENTS: Only run IF the specified boolean is equal to true.
    == OPERATOR: Checks if one value is equal to another.
    != OPERATOR: Checks if one value is NOT equal to another.
    ! OPERATOR: Flips the value of a boolean. e.g. !(10 == 10)  -> false
     */
    public static void main(String[] args) {
        if (5 == 5) {
            //WILL run because the condition evaluates to true
            System.out.println("Yep!");
        }

        if (5 != 5) {
            //WILL NOT run because the condition evaluates to false
            System.out.println("No!");
        }

        boolean isCool = true;
        if (isCool) {
            //WILL run because the boolean is true
            System.out.println("I'm cool!");
        }
        /*
        COMPOUND CONDITIONALS: Combining 2 conditional expressions
        together by the && (AND) and || (OR) operators
         */
        if (3 > 1 && 1 < 5) {
            //WILL NOT run because the 2nd condition is not met
            System.out.print("AND!");
        }

        if (3 > 1 || 1 < 5) {
            //WILL run because one of the conditions are met
            System.out.println("OR!");
        }
    }
}

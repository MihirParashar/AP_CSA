public class Lambda {
    /*
    FUNCTIONAL PROGRAMMING: A programming paradigm like OOP,
    but the concept is that you get a desired result through
    a series of functions that don't change values, but returns
    new ones, like a math function.
    In functional programming, functions act like variables: they
    can be named, passed as arguments, and returned. They are known
    as "first-class citizens" (weird name!)

    FUNCTIONAL INTERFACE: An interface that only has one method. This
    can be used for lambda expressions.

    LAMBDA: An expression that inmplements a functional interface in only
    one line, using special syntax:
    (args) -> <value to return>
     */

    public static void main(String[] args) {
        Modify add10 = generateAdder(10);

        System.out.println(add10.modify(26)); //Output: 36

        Integer[] values = {-10, 15, 18, -30, 12, -1, 19, -49, -27, 24}; //5 negative values, 5 positive values
        int positiveValueCount = countItemsFiltered(values, (x) -> (int) x >= 0);
        System.out.println(positiveValueCount); //Output: 5
    }

    public static Modify generateAdder(int addingValue) {
        //Extremely short syntax
        return (x) -> x + addingValue;
    }

    public static int countItemsFiltered(Object[] items, ValueFilter filter) {
        int count = 0;

        for (Object item : items) {
            if (filter.filter(item)) {
                count++;
            }
        }

        return count;
    }
}

interface Modify {
    public int modify(int value);
}

interface ValueFilter {
    public boolean filter(Object value);
}


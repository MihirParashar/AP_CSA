public class Strings {
    /*
    STRINGS: Hold text in double quotes, e.g. "Hello world!"
    STRINGS ARE OBJECTS! This means that functions can be called
    on them, unlike primitive types (int, double, char, etc.)
    Primitives store only data.
    Objects store data AND functionality.

    USEFUL STRING METHODS:
    split(): returns string array split up at the string passed
    e.g. "bingxbong".split("x") returns ["bing", "bong"]

    substring(): returns a part of the string inside the
    string from the starting and ending index passed
    e.g. "bingxbong".substring(0, 4) returns "bing"

    equals(): checks if a string is equal to another
    string. This is the correct way of checking strings,
    you should NOT use == for strings!
    e.g. "hello".equals("hello") returns true

    trim(): removes all whitespace at the beginning
    and end of a string.
    e.g. " Hello   ".trim() returns "Hello"
     */

    public static void main(String[] args) {
        String hello = "Hello World!";
        System.out.println(hello);

        //These functions don't modify the actual value of the
        //variable: they just return the value, which we can
        //then store in another variable
        hello.split(" "); //Won't modify hello variable
        //Storing the result in a variable
        String[] helloSplit = hello.split(" ");
        System.out.println(helloSplit[0]); //Output: "Hello"
    }
}

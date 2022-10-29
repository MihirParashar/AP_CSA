import java.util.List;
import java.util.ArrayList;

public class Lists {
    /*LISTS VS ARRAYS:
       Lists are more flexible, and they can change size unlike arrays.
       Lists have tons of useful methods, like find() and count()
       SYNTAX: List<type> name = new ArrayList<type>();

       Lists can ONLY store objects (e.g. Strings), not primitives (e.g. ints)
       If you want to store primitve types, use their wrapping class
       char -> Character | int -> Integer  | boolean -> Boolean | etc...
     */
    public static void main(String[] args) {
        //Unlike arrays, size doesn't have to be defined on initialization.
        List<String> names = new ArrayList<>();

        //Adding elements to the list.
        names.add("Bob");
        names.add("John");
        names.add("Tim");

        //Getting and setting items of the list
        System.out.println(names.get(0)); //List version of names[0]
        names.set(1, "Mark"); //List version of names[1] = "Mark"
        names.remove(2);
    }
}

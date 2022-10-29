import java.util.HashSet;
import java.util.Set;

public class Sets {
    /*
    SETS: Like lists, but they are unordered, and multiple
    items of the same value. Their main purpose is to simply
    check if an item is in a set or not.
    SYNTAX: Set<type> name = new HashSet<>();
    Mainly, the only methods are add() size(), contains()
     */

    public static void main(String[] args) {
        Set<String> gymMembers = new HashSet<>();
        String[] names = new String[]{"Dally", "Darry", "Sodapop"};
        gymMembers.add("Johnny");
        gymMembers.add("Pony");
        gymMembers.add("Dally");
        for (String name : names) {
            if (gymMembers.contains(name)) {
                System.out.println(name + " is a gym member!");
            } else {
                System.out.println(name + " is not a gym member!");
            }
        }
    }
}

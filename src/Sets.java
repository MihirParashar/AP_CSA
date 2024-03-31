import java.util.HashSet;
import java.util.Set;

public class Sets {
    /*
    SETS: Like lists, but they are unordered, and there are no
    duplicate items (if one tries to add a duplicate item, it
    just won't add anything). Their main purpose is to simply
    check if an item is in a set or not.
    SYNTAX: Set<type> name = new HashSet<>();
    Mainly, the only methods are add() size(), contains()
     */

    public static void main(String[] args) {
        Set<String> gymMembers = new HashSet<>();
        gymMembers.add("Johnny");
        gymMembers.add("Pony");
        gymMembers.add("Darry");

        String[] names = new String[]{"Darry", "Cherry", "Sodapop"};
        for (String name : names) {
            if (gymMembers.contains(name)) {
                System.out.println(name + " is a gym member!");
            } else {
                System.out.println(name + " is not a gym member!");
            }
        }
    }
}

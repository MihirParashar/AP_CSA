import java.util.HashMap;
import java.util.Map;

public class Maps {
    /*
    MAPS: Stores a list of key-value pairs. Similar to a list,
    but it stores a key and a value instead of an item.
    Ex: storing a map of user IDs (int) to their usernames (string).
    Entry - a key-value pair. getKey() getValue()
    SYNTAX: Map<key_type, value_type> name = new HashMap<>();
     */

    public static void main(String[] args) {
        Map<Integer, String> users = new HashMap<>();

        //Add users to the map
        users.put(1234, "johnthekid");
        users.put(4321, "maxatron");
        users.put(123, "hello_world");
        users.put(321, "i_love_java");

        //Get item of map by key
        System.out.println(users.get(123));

        //Get item of map by key, OR set to default value if key does not exist
        //ID 9999 doesn't exist, prints "Not Found"
        System.out.println(users.getOrDefault(9999, "Not Found"));

        //Iterate through map
        for (Map.Entry<Integer, String> user : users.entrySet()) {
            System.out.println("ID: " + user.getKey() + " NAME: " + user.getValue());
        }

        //Iterate through just keys
        for (Integer id : users.keySet()) {
            System.out.println(id);
        }

        //Iterate through just values
        for (String name : users.values()) {
            System.out.println(name);
        }
    }
}

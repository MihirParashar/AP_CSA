import java.util.ArrayList;
import java.util.List;

public class Generics {
    /*
    GENERICS: Classes/Interfaces that allow us to input
    type parameters, like Lists. When we use type
    parameters, the compiler knows what types of objects
    should be inputted to methods, and will automatically
    downcast and throw errors if the type is wrong. However,
    the compiler discards the type info at runtime since it
    is no longer necessary.

    Note that type parameters CANNOT be used as
    variables, because they aren't. They're class
    names, and should be used as types. You also
    CANNOT use them as constructors or reassign them.
    Also, arrays cannot use type parameters.
     */
    public static void main(String[] args) {
        //region UNGENERIFIED (BAD)
        System.out.println("\n\nUNGENERIFIED");

        LastN last5 = new LastN(5);

        //We can add ANY type of Object to this.
        last5.add("Hello");

        for (int i = 0; i < 10; i++) {
            last5.add(i);
            System.out.println(last5.getValues());
        }

        //Even though WE know that the first item is an Integer,
        //LastN accepts ANY type of Object to add, so we have to
        //manually check if it's an Integer, which is inconvenient.
        if (last5.getValues().get(0) instanceof Integer firstItem) {
            int x = firstItem + 5;
            System.out.println("First item + 5: " + x);
        }
        //endregion

        //region GENERIFIED (GOOD)
        System.out.println("\n\nGENERIFIED");
        GenerifiedLastN<Integer> genericLast5 = new GenerifiedLastN<>(5);
        for (int i = 0; i < 10; i++) {
            genericLast5.add(i);
            System.out.println(genericLast5.getValues());
        }

        //Now, we can only add Integers.
        //genericLast5.add("Hey");
        //^^^^^^^^^^^^^^^^^^^^^^^^ Will throw an error

        //However, we can now easily call Integer operations on our items.
        int x = genericLast5.getValues().get(0) + 5;
        System.out.println("First item + 5: " + x);
        //endregion
    }
}

//Ungenerified
class LastN {
    private List<Object> values;
    private final int size;
    public LastN(int size) {
        this.size = size;
        values = new ArrayList<>(size);
    }
    public List<Object> getValues() {
        return values;
    }
    public void add(Object o) {
        values.add(o);
        if (values.size() > size) {
            values.remove(0);
        }
    }
}

//Generified
class GenerifiedLastN<E> {
    private List<E> values;
    private final int size;
    public GenerifiedLastN(int size) {
        this.size = size;
        values = new ArrayList<>();
    }
    public List<E> getValues() {
        return values;
    }
    public void add(E item) {
        values.add(item);
        if (values.size() > size) {
            values.remove(0);
        }
    }
}
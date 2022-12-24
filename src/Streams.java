import java.util.stream.Stream;

public class Streams {
    /*
    STREAMS: A stream is a sequence of objects that have
    a variety of methods that allow you to achieve a
    desired result. They simplify a lot of processes,
    such as sorting, summing, filtering, and transforming.

    INTERMEDIATE OPERATIONS: Stream methods that return a modified
    version of the stream. They can be chained together to create complex
    operations, such as squaring every number in a list and filtering out evens.

    sorted() -> Sorts the stream.
    map() -> Modifies each element of the stream using a lambda expression.
    filter() -> Returns all items of the stream that satisfy a boolean expression.

    TERMINAL OPERATIONS: Stream methods that return a void or primitive type.
    These terminate the stream, meaning you can't call any methods on it past this.

    forEach() -> Iterates through every element of the stream and runs a lambda expression.
    count() -> Returns the length of the stream.
     */

    public static void main(String[] args) {
        //Square every number in the stream, filter out
        //the even numbers, and print each one out.
        System.out.println("SQUARED EVENS");
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .map(i -> i * i)
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);

        //Counts every odd number in the stream.
        long oddNumbers = Stream.of(1, 2, 3, 4, 5)
                            .filter(i -> (i % 2) != 0)
                            .count();
        System.out.println("# of odds: " + oddNumbers);


    }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

@FunctionalInterface
interface IntegerOperation {
    int apply(int x);

    // Static method to get an IntegerOperation that squares a number
    static IntegerOperation squareOperation() {
        return x -> x * x;
    }

    // Default method to check if a number is odd
    default boolean isOdd(int x) {
        return x % 2 != 0;
    }
}

public class StreamApiExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Get the square operation using the static method
        IntegerOperation squareOp = IntegerOperation.squareOperation();

        // Create a list to store the result
        List<Integer> result = new ArrayList<>();

        // Process the numbers using a forEach loop
        numbers.forEach(n -> {
            // Check if the number is odd using the default method
            if (squareOp.isOdd(n)) {
                // Apply the square operation and add to the result list
                result.add(squareOp.apply(n));
            }
        });

        // Print the result
        result.forEach(System.out::println);
    }
}

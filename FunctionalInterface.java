@FunctionalInterface
interface IntegerOperation {
    int apply(int x);
}

public class StreamApiExample {
    public static void main(String[] args) {
      
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

       
        IntegerOperation squareOperation = x -> x * x;

       
        List<Integer> result = numbers.stream()
                                      .filter(n -> n % 2 != 0) // Filter out even numbers
                                      .map(n -> squareOperation.apply(n)) // Apply custom operation
                                      .collect(Collectors.toList()); // Collect results into a list

       
        System.out.println(result); 
    }
}

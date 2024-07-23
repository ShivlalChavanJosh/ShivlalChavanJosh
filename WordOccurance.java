import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        String statement = "people love to love people";
        countWordOccurrences(statement);
    }

    public static void countWordOccurrences(String statement) {
        // Split the statement into words
        String[] words = statement.split("\\s+");

        // Create a map to store the word count
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Iterate through each word in the array
        for (String word : words) {
            // Convert word to lowercase to make counting case insensitive
            word = word.toLowerCase();

            // If the word is already in the map, increment its count
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                // If the word is not in the map, add it with a count of 1
                wordCountMap.put(word, 1);
            }
        }

        // Print the word counts
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

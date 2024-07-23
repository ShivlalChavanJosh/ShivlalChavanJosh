import java.util.HashMap;
import java.util.Map;

class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the statement:-");
        String statement = sc.nextLine();
        sc.close();
        checkoccurance(statement);
      
    }
    
    public static void checkoccurance(String statement){
        
        String[] words = statement.split("\\s+");

        Map<String,Integer> wordsCount = new HashMap<>();

        for(String word: words){
            word = word.toLowerCase();

             if(wordsCount.containsKey(word)){
                 wordsCount.put(word,(wordsCount.get(word)+1));
             }else{
                 wordsCount.put(word,1);
             } 
        }

        for(Map.Entry<String,Integer> entry: wordsCount.entrySet()){
            System.out.println(entry.getKey() + ":"+ entry.getValue());
        }
        

    }
}

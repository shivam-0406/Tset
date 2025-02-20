import java.util.*;

public class File3 {
    public static void main(String[] args){
        String text = "This is a test string. This string is for testing.";
        
        text = text.toLowerCase().replaceAll("[^a-zA-Z ]", "");
        String[] words = text.split("\\s+");
   
        HashMap<String, Integer> wordCount = new HashMap<>();
        
        for (String word : words){
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

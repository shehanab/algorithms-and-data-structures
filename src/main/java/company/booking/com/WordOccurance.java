package booking.com;

import java.util.*;

public class WordOccurance {

    public static void main(String[] args) {
        String input = "breakfast is ready";
        List<String> words = Arrays.asList("breakfast", "beach", "hotel", "world");
        System.out.println(findWords(input, words));
    }

    public static Map<String, Integer> findWords(String stream, List<String> words) {
        Map<String, Integer> wordCounts = new HashMap<String, Integer>();

        String[] splitwords = stream.split(" ");
        ArrayList<String> splittedWords = new ArrayList<String>(Arrays.asList(splitwords));
        for (int i = 0; i < words.size(); i++) {
            int count = 0;
            String word = words.get(i);
            for (int j = 0; j < splittedWords.size(); j++) {

                if (splittedWords.get(j).equals(word)) {
                    count++;
                }
            }
            wordCounts.put(word, count);
        }
        return wordCounts;
    }
}
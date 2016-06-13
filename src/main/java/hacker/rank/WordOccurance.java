package hacker.rank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Shehan on 6/8/16.
 */
public class WordOccurance {

    public static void main(String[] args) {
        String input = "acacabcatghhellomvnsdb";
        List<String> words = Arrays.asList("aca", "cat", "hello", "world");
        System.out.println(findWords(input, words));
    }

    public static Map<String, Integer> findWords(String stream, List<String> words) {
        Map<String, Integer> wordCounts = new HashMap<String, Integer>();

        for (int i = 0; i < words.size(); i++) {
            int count = 0;
            String word = words.get(i);
            for (int j = 0; j < stream.length(); j++) {
                if (j + word.length() < stream.length()) {
                    String temp = stream.substring(j, word.length());
                    if (temp.equals(word)) {
                        count++;
                    }
                }
            }
            wordCounts.put(word, count);
        }
        return wordCounts;
    }







//
//    public findWords(){
//        String input = "acacabcatghhellomvnsdb";
//        HashMap<String,Integer> hm= new HashMap<String,Integer>();
//        String[] arr={"aca","cat","hello","world"};
//
//        for (String word: arr){
//            int i = input.indexOf(word);
//            if (i>=0)
//                hm.put(word, 1);
//            i = input.indexOf(word, i+1);
//            while(i>=0){
//                hm.put(word, hm.get(word)+1);
//                i=input.indexOf(word, i+1);
//            }
//        }


}

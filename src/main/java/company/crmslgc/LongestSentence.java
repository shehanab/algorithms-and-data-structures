package crmslgc;

import java.util.Arrays;
import java.util.List;

public class LongestSentence {

    public static void main(String[] args) {
        String input = "We test coders. Give us a try?";

        String input1 = "Forget CVs..Save time , x x";

        System.out.println(maxWordCount(input));
        System.out.println(maxWordCount(input1));
    }

    private static int maxWordCount(String input) {
        // https://stackoverflow.com/questions/55159951/find-the-max-number-of-words-in-java-8-fashion


/*
        return Arrays.stream(input.split("[.!?,]"))
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .mapToInt(s -> s.split("\\s+").length)
                .max()
                .orElse(0);
*/

        return Arrays.stream(input.split("\\s*+(?:[.!?,]\\s*+)+"))
                .mapToInt(s -> s.split("\\s+").length)
                .max()
                .orElse(0);

    }


    public static int solution(String S) {

        String[] sentencesplits = S.trim().split("[.?!]");

        int maxwords = 0;
        for (int i = 0; i < sentencesplits.length; i++) {

            String[] wordssplits = sentencesplits[i].trim().replaceAll(" +", ".").split("[.]");
            if (maxwords < wordssplits.length) {
                maxwords = wordssplits.length;
            }
        }
        return maxwords;
    }

    public static int solution2(String S) {
        int maxNoOfWords = 0;
        for (String sentence : S.split("\\.|\\?|\\!")) {
            int wordCount = 0;
            List<String> words = Arrays.asList(sentence.split("\\s+"));
            for (int i = 0; i < words.size(); i++) {
                final String word = words.get(i);
                if (!word.isEmpty())
                    wordCount++;
            }
            if (maxNoOfWords < wordCount)
                maxNoOfWords = wordCount;


        }


        return maxNoOfWords;
    }

}

package cacib;

import java.util.Arrays;

public class SentenceWIthMaxWordCount {


    public static void main(String[] args) {
        String input ="We test coders. Give us a try?";

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


}

package text.processing;

import java.util.*;

/**
 * Reverse words in a sentence: Given a string, reverse the order of words, not the characters.
 */
public class ReverseWordsInSentence {
    public static String reverseWords(String sentence) {
        // Trim the sentence to remove extra spaces from the start and end
        sentence = sentence.trim();

        // Split the sentence into words using a regular expression to handle multiple spaces
        String[] words = sentence.split("\\s+");

        // Create a StringBuilder to store the reversed sentence
        StringBuilder reversedSentence = new StringBuilder();

        // Traverse the words array in reverse order and append the words to the StringBuilder
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);

            // Add a space between words, but not after the last word
            if (i != 0) {
                reversedSentence.append(" ");
            }
        }

        // Return the reversed sentence as a string
        return reversedSentence.toString();
    }

    public static void main(String[] args) {
        String sentence = "  Hello   world  from   Java  ";
        String result = reverseWords(sentence);
        System.out.println("Reversed sentence: " + result);
    }
}
package visa.anagram;

public class AnagramDifference {

    static int difference(String a, String b) {
        int diff = -1;

        if (a.length() != b.length()) {
            return -1;
        }

        if (a.equals(b)) {
            return 0;
        }

        return countManipulations(a, b);
    }

    static int countManipulations(String s1, String s2) {
        int count = 0;

        // store the count of character
        int[] char_count = new int[26];

        // iterate though the first String and update
        // count
        for (int i = 0; i < s1.length(); i++)
            char_count[s1.charAt(i) - 'a']++;

        // iterate through the second string
        // update char_count.
        // if character is not found in char_count
        // then increase count
        for (int i = 0; i < s2.length(); i++)
            if (char_count[s2.charAt(i) - 'a']-- <= 0)
                count++;

        return count;
    }

    /****/

    public static int numberNeeded(String first, String second) {
        int[] freqFirst = new int[26];
        int[] freqSecond = new int[26];
        int deletions = 0;

        for (int i = 0; i < first.length(); i++)
            freqFirst[first.charAt(i) - 'a'] = freqFirst[first.charAt(i) - 'a'] + 1; //Increment frequency of char at i
        for (int i = 0; i < second.length(); i++)
            freqSecond[second.charAt(i) - 'a'] = freqSecond[second.charAt(i) - 'a'] + 1; //Increment frequency of char at i

        for (int i = 0; i < 26; i++)
            deletions += Math.abs(freqFirst[i] - freqSecond[i]); //Track the total deletions needed

        return deletions;
    }

    public static void main(String[] args) {
        System.out.println(difference("ddcf", "cedk"));
        System.out.println(difference("tea", "ate"));
        System.out.println(difference("tea", "toe"));
        System.out.println(difference("acts", "act"));
        System.out.println(difference("aaa", "bbb"));
    }
}

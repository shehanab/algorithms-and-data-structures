package visa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RandomNote2 {
    public static void main(String[] args) {
        int result = check("We can use the valueOf(char ch) method of String class to convert a passed char ch to a String. This method accepts char as an argument and returns the string", "String");
        System.out.println(result);
    }

    // Complexity O(n) + O(n) + O(n) = O(n)
    public static int check(String text, String note) {
        int size = sizeOfArray(note);
        System.out.println(size);
        int[] textCount = count(text, size);
        int[] noteCount = count(note, size);

        printArr(textCount);
        printArr(noteCount);

        for (int i = 0; i < size; i++) {
            if (textCount[i] < noteCount[i]) {
                return 0;
            }
        }

        return 1;
    }

    // Complexity O(n)
    public static int sizeOfArray(String chars) {
        char[] charArray = chars.toCharArray();
        int max = 1;
        for (char c : charArray) {
            if (max < c) {
                max = c;
            }
        }
        return max;
    }

    // Complexity O(n) x O(1) = O(n)
    public static int[] count(String chars, int size) {
        int[] lookup = new int[size];
        chars = chars.trim();
        // Complexity O(n)
        for (char c : chars.toCharArray()) {
            // Complexity 0(1)
            if (Character.isWhitespace(c)) {
                continue;
            }
            if (c <= size) {
                // Complexity O(1)
                int i = lookup[c - 1];
                lookup[c - 1] = i + 1;
            }
        }


        return lookup;
    }

    static void printArr(int[] arr) {
        System.out.println("#");
//        for(int i : arr){
//            System.out.println(i);
//        }

        System.out.println(Arrays.toString(arr));
        System.out.println("#");

    }

    public static void ransomNote(String[] magazine, String[] ransom) {
        if (ransom.length > magazine.length) {
            System.out.println("No");
            return;
        }
        Map<String, Integer> helper = new HashMap<>();
        for (String s : magazine) {
            if (!helper.containsKey(s)) {
                helper.put(s, 1);
            } else {
                helper.put(s, helper.get(s) + 1);
            }
        }
        for (String s : ransom) {
            if (helper.containsKey(s)) {
                helper.put(s, helper.get(s) - 1);
                if (helper.get(s) - 1 < 0) {
                    System.out.println("No");
                    return;
                }
            } else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}


package visa.twin.string;

public class RandomNote2 {
    public static void main(String[] args) {
        int result = check("We can use the valueOf(char ch) method of String class to convert a passed char ch to a String. This method accepts char as an argument and returns the string", "String");
        System.out.println(result);
    }

    // Complexity O(n) + O(n) + O(n) = O(n)
    public static int check(String text, String note) {
        int size = sizeOfArray(note);
        int[] textCount = count(text, size);
        int[] noteCount = count(note, size);

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
                System.out.println(c);
                // Complexity O(1)
                System.out.println(c - 1);
                int i = lookup[c - 1];
                lookup[c - 1] = i + 1;
            }
        }


        return lookup;
    }
}

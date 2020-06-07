package mdaq;

public class CoinPattern {


    public static void main(String[] args) {
        int[] input1 = {1, 0, 1, 0, 1, 1}; // 1
        System.out.println(minimumReverseCount(input1));

        int[] input2 = {1, 1, 0, 1, 1}; // 2
        System.out.println(minimumReverseCount(input2));

        int[] input3 = {1, 0, 1}; // 0
        System.out.println(minimumReverseCount(input3));

        int[] input4 = {0, 1, 1, 0}; // 2
        System.out.println(minimumReverseCount(input4));
    }


    private static int minimumReverseCount(int[] input) {
        return Math.min(reverseCountBySide(input, 0), reverseCountBySide(input, 1));
    }


    private static int reverseCountBySide(int[] input, int side) {
        int count = 0;
        for (int value : input) {
            if (value != side) {
                count++;
            }
            side = side == 0 ? 1 : 0;
        }
        return count;
    }


    //  Driver code to test above method
//    public static void main(String args[])
//    {
//        String str = "0001010111";
//        System.out.println(minFlipToMakeStringAlternate(str)); // 2
//        System.out.println(minFlipToMakeStringAlternate("101011"));
//        System.out.println(minFlipToMakeStringAlternate("11011"));
//        System.out.println(minFlipToMakeStringAlternate("101"));
//        System.out.println(minFlipToMakeStringAlternate("0110"));
//    }

    // method return minimum flip to make binary
    // string alternate
    public static int minFlipToMakeStringAlternate(String str) {
        //  return minimum of following two
        //  1) flips when alternate string starts with 0
        //  2) flips when alternate string starts with 1
        return Math.min(getFlipWithStartingCharcter(str, '0'),
                getFlipWithStartingCharcter(str, '1'));
    }

    //  Utility method to get minimum flips when
    //  alternate string starts with expected char
    public static int getFlipWithStartingCharcter(String str,
                                                  char expected) {
        int flipCount = 0;
        for (int i = 0; i < str.length(); i++) {
            //  if current character is not expected,
            // increase flip count
            if (str.charAt(i) != expected)
                flipCount++;

            //  flip expected character each time
            expected = flip(expected);
        }
        return flipCount;
    }

    //  Utility method to flip a character
    public static char flip(char ch) {
        return (ch == '0') ? '1' : '0';
    }


}

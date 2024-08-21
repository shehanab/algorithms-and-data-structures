package company.asus.q3;

public class Solution {

    public static void main(String[] args) {

    }


    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public String solution(int N) {
        int uniqueLettersCount = calculateUniqueLettersCount(N);
        int repeatCount = calculateRepeatCount(N, uniqueLettersCount);
        int remainderCount = calculateRemainder(N, uniqueLettersCount);

        StringBuilder result = new StringBuilder();

        appendRepeatedLetters(result, uniqueLettersCount, repeatCount);
        appendRemainingLetters(result, remainderCount);

        return result.toString();
    }

    private int calculateUniqueLettersCount(int N) {
        return Math.min(N, ALPHABET.length());
    }

    private int calculateRepeatCount(int N, int uniqueLettersCount) {
        return N / uniqueLettersCount;
    }

    private int calculateRemainder(int N, int uniqueLettersCount) {
        return N % uniqueLettersCount;
    }

    private void appendRepeatedLetters(StringBuilder result, int uniqueLettersCount, int repeatCount) {
        for (int i = 0; i < uniqueLettersCount; i++) {
            for (int j = 0; j < repeatCount; j++) {
                result.append(ALPHABET.charAt(i));
            }
        }
    }

    private void appendRemainingLetters(StringBuilder result, int remainderCount) {
        for (int i = 0; i < remainderCount; i++) {
            result.append(ALPHABET.charAt(i));
        }
    }

}

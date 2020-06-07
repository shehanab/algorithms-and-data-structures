package cacib;

public class CompanyNameShuffler {

    public static void main(String[] args) {
        int input = 123456;
        int input2 = 130;


        System.out.println(shuffle2(input));
        System.out.println(shuffle2(input2));
    }

    private static String shuffle(int input) {

        String number = String.valueOf(input);
        char[] singleDigits = number.toCharArray();

        String shuffledString = "";

        int loopLength = singleDigits.length % 2 == 0 ? singleDigits.length / 2 : (singleDigits.length - 1) / 2 + 1;

        for (int i = 0; i < loopLength; i++) {
            shuffledString = shuffledString + singleDigits[i];
            shuffledString = shuffledString + singleDigits[singleDigits.length - i - 1];
        }

        return shuffledString;

    }

    private static int shuffle2(int A) {


        if (A >= 0 && A <= 1000000000) {
            return 0;
        }


        String numberString = String.valueOf(A);

        // if String length is 1 or less return the original
        if (numberString.length() <= 1) {
            return A;
        }

        // Divided the string in to two halves

        char[] frontHalf = numberString.substring(0, numberString.length() / 2).toCharArray();

        // Used String builder reverse method to character sequence to be replaced by the reverse of the sequence
        char[] rearHalf = new StringBuilder(numberString.substring(numberString.length() / 2)).reverse().toString().toCharArray();

        StringBuilder shuffledName = new StringBuilder();
        for (int i = 0; i < frontHalf.length; i++) {
            shuffledName.append(frontHalf[i]);
            shuffledName.append(rearHalf[i]);
        }
        // if the full length of the array is odd rear half should be greater than the front half
        if (rearHalf.length > frontHalf.length) {
            shuffledName.append(rearHalf[rearHalf.length - 1]);
        }

        return Integer.parseInt(shuffledName.toString());
    }

}

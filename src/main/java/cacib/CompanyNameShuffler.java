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

    private static int shuffle2(int num) {

        String str = String.valueOf(num);
        if (str.length() <= 1) {
            return num;
        }

        char[] firstHalf = str.substring(0, str.length() / 2).toCharArray();
        char[] secondHalf = new StringBuilder(str.substring(str.length() / 2)).reverse().toString().toCharArray();
        StringBuilder finalStr = new StringBuilder();
        for (int i = 0; i < firstHalf.length; i++) {
            finalStr.append(firstHalf[i]);
            finalStr.append(secondHalf[i]);
        }
        // To handle for odd numbers length of array
        if (secondHalf.length > firstHalf.length) {
            finalStr.append(secondHalf[secondHalf.length - 1]);
        }

        return Integer.parseInt(finalStr.toString());
    }
}

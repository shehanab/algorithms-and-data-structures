package crmslgc;

public class IntegerBinConstruction {

    public static void main(String[] args) {
        System.out.println(intBinCon(18));
        System.out.println(minSequence(18));
    }

    private static int intBinCon(int input) {
        int count = 0;

        if (input == 1)
            return count;

        while (input != 1) {
            if (input % 2 == 0) {
                input /= 2;
            } else {
                --input;
            }
            ++count;
        }
        return count;

    }


    private static int minSequence(int N) {
        int count = 0;
        for (int i = N; i != 1; ) {
            if (i % 2 == 0) {
                i /= 2;
            } else {
                --i;
            }
            ++count;
        }
        return count;
    }

}

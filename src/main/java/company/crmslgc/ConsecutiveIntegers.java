package crmslgc;

public class ConsecutiveIntegers {

    public static void main(String[] args) {

        int[] a = {1, 1, 2, 3, 3};
        int[] b = {0, 1, 2, 3, 5};
        int[] c = {1, 1, 3, 2, 4};

        System.out.println(findConsecutiveIntegers(a, 3));
        System.out.println(findConsecutiveIntegers(b, 3));
        System.out.println(findConsecutiveIntegers(c, 3));

    }

    private static boolean findConsecutiveIntegers(int[] A, int K) {
        int[] sequence = {};
        for (int i = 0; i < A.length; i++) {
            if (A[i] != A[i + 1] && A[i] + 1 != A[i + 1])
                return false;
            return A[0] == 1 && A[A.length - 1] == K;
        }

        return false;
    }


}

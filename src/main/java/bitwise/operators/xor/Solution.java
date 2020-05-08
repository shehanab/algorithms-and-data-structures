package bitwise.operators.xor;

class Solution {

    public static void main(String[] args) {
        int[] a = {2, 3, 1, 5};
        System.out.println(solution1(a));
    }

    public static int solution(int[] A) {
        int n = A.length;
        int total = 0;

        for (int i = 0; i < n; i++) {
            total = total ^ A[i] ^ (i + 1);
        }

        return total ^ (n + 1);

    }

    public static int solution1(int[] A) {
        int n = A.length;
        int total = 0;
        int arrTotal = 0;
//        for (int i = 1; i < n + 2; i++) {
//            total = total + i;
//        }

        for (int i : A) {
            arrTotal = arrTotal + i;
        }

        total = ((n * (n + 1)) / 2);

        return total - arrTotal;
    }
}
package crmslgc;

public class LightBulbs {

    public static void main(String[] args) {

        int[] input1 = {2, 3, 4, 1, 5};
        int[] input2 = {1, 3, 4, 2, 5};
        System.out.println(solution(input1));
        System.out.println(solution(input2));

    }

    private static int solution(int[] A) {
        int turn = 0;
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            if (max < A[i]) {
                max = A[i];
            }
            if (max == i + 1)
                turn += 1;
        }
        return turn;
    }
}

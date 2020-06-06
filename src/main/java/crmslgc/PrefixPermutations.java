package crmslgc;

public class PrefixPermutations {


    public static void main(String[] args) {
        int [] input = {2, 1, 3, 5, 4};
        System.out.println(solution(input));
    }


    public static int solution(int[] A) {

        int realCount = 0;
        int tempTotal = 0;

        int prefix = 0;

        for (int i = 0; i < A.length; i++) {
            realCount += i + 1;
            tempTotal += A[i];
            if (realCount == tempTotal) {
                prefix++;
            }
        }
        return prefix;
    }
}

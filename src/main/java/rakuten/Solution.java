package rakuten;

/**
 * Created by Shehan on 6/13/16.
 */
public class Solution {

    public static void main(String[] args) {

        System.out.println(solution(3, 4, 0));
        System.out.println(solution(3, 4, 1));
        System.out.println(solution(3, 4, 2));
        System.out.println(solution(3, 4, 3));
        System.out.println(solution(3, 4, 4));
        System.out.println(solution(3, 4, 5));
        System.out.println(solution(-3, -4, -5));
        System.out.println(solution(3, 4, -5));
        System.out.println(solution(3, -4, 5));
        System.out.println(solution(-3, 4, 5));

    }


    public static int solution(int A, int B, int N) {
        if (A < 0 || B < 0 || N < 0) {
            return -1;
        } else if (N == 0) {
            return A % 1000_000_007;
        } else if (N == 1) {
            return B % 1000_000_007;
        } else {
            return (solution(A, B, N - 1) + solution(A, B, N - 2)) % 1000_000_007;
        }
    }

}

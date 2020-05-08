package bitwise.operators.odd.occurance;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Shehan on 6/12/16.
 */
public class Solution {

    public static void main(String[] args) {
        int[] a = {2, 2, 9, 8, 1};
        System.out.println(solution(a, 5));
        test(a);

    }

    public static int solution(int[] A, int N) {

        int val = 0;
        for (int i = 0; i < N; i++) {
            val ^= A[i];
        }

        return val;


    }

    public static void test(int[] A) {

        List<Integer> numberList = IntStream.of(A).boxed().collect(Collectors.toList());

        Optional<Integer> odd = numberList.stream()
                .reduce((x, y) -> x ^ y);

        System.out.println(odd.get());
    }
}

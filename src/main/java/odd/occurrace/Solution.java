package odd.occurrace;

/**
 * Created by Shehan on 5/18/16.
 */
public class Solution {

    public static void main(String[] args) {
        int arr [] = {9, 3, 9, 3, 9, 7, 9};

        System.out.println(solution(arr));
    }

    public static int solution(int[] A) {
        int unpaired = 0;
        for (int number : A) {
            unpaired ^= number;
            System.out.println(unpaired);
        }
        return unpaired;
    }
}

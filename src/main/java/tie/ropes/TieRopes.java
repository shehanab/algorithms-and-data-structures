package tie.ropes;

/**
 * Created by Shehan on 5/19/16.
 */
public class TieRopes {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 1, 3};
//        System.out.println(solution(4, arr));

        System.out.println(getTotal(3));
    }

    public static int solution(int K, int[] A) {
        // write your code in Java SE 8
        int count = 0;
        int current = 0;

        for (int i : A) {
            current += i;
            if (current >= K) {
                count++;
                current = 0;
            }
        }

        return count;
    }


    public static int getTotal(int n) {
        int total = 0;
        total = (n + 1) * n / 2;
        return total;
    }
}

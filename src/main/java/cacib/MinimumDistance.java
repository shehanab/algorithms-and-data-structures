package cacib;

public class MinimumDistance {

    public static void main(String[] args) {

        int[] input = { 8, 24, 3, 20, 1, 17 };
        int[] input2 = { 7, 21, 3, 42, 3, 7 };

        System.out.println(minimumDistance(input));
        System.out.println(minimumDistance(input2));
    }

    private static int minimumDistance(int[] arr) {
        int minimumDistance = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                int x = Math.abs((arr[i] - arr[j]));
                if(x < minimumDistance) {
                    minimumDistance = x;
                }
            }
        }

        return minimumDistance;

    }
}

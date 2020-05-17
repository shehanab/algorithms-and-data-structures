package cacib;

public class EvenPairCount {
    public static void main(String[] args) {
        //int [] input = {2, 1, 5, -6, 9};
        int[] input = {1, 2, 3, 4, 5};

        System.out.println(evenPairCount(input));
        System.out.println(evenPairCount2(input));


    }

    private static int evenPairCount2(int[] arr) {
        int pairCount = 0;
        int evenCount = 0;
        int oddCount = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        pairCount += ((evenCount * (evenCount - 1)) / 2);

        pairCount += ((oddCount * (oddCount - 1)) / 2);

        return pairCount;
    }

    private static int evenPairCount(int[] arr) {
        int pairCount = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) % 2 == 0) {
                    pairCount++;
                }
            }
        }

        return pairCount;
    }

    private static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

}

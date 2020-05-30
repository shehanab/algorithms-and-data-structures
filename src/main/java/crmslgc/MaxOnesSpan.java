package crmslgc;

public class MaxOnesSpan {

    public static void main(String[] args) {
        int[] A = {0, 1, 1, 1, 0, 1, 1, 1, 0, 1};
        int[] B = {0, 0};
        int[] C = {0, 1, 1, 1, 0, 1, 1, 1, 0, 1};

        System.out.println(getMaxLength(A));
        System.out.println(maxOneseSpan(A));
        System.out.println(maxOneseSpan(B));

    }


    private static int maxOneseSpan(int[] arr) {
        int start = 0;
        int maxStart = 0;
        int count = 0; //intitialize count
        int maxCount = 0; //initialize max

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                count = 0;
                start = 0;
            } else {
                count++;//increase count
                if(count == 1){
                    start = i;
                }

                if(count > maxCount){
                    maxCount = count;
                    maxStart = start;
                }
            }
        }

        return (maxCount == 0) ? -1 : maxStart;
    }

    // Returns count of maximum consecutive 1's
    // in binary array arr[0..n-1]
    static int getMaxLength(int arr[]) {

        int count = 0; //intitialize count
        int result = 0; //initialize max

        for (int i = 0; i < arr.length; i++) {

            // Reset count when 0 is found
            if (arr[i] == 0)
                count = 0;

                // If 1 is found, increment count
                // and update result if count becomes
                // more.
            else {
                count++;//increase count
//                result = Math.max(result, count);

                if(count > result){
                    result = count;
                }
            }
        }

        return result;
    }
}

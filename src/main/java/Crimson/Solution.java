package Crimson;

class Solution {

    public static void main(String[] args) {
        int [] input = {6, 42, 11, 7, 1, 42};
        System.out.println(findIndex(9, 43, input));

        int [] input2 = {13, 13, 1, 6};
        System.out.println(findIndex(6, 13, input2));

        int [] input3 = {100, 63, 1, 6, 2, 13};
        System.out.println(findIndex(100, 63, input3));

        int [] input4 = {7, 42, 5, 6, 42, 8, 7, 5, 3, 6, 7};
        System.out.println(findIndex(7, 42, input4));
    }



    public static int solution(int X, int Y, int[] A) {
        int N = A.length;
        int result = -1;
        int nX = 0;
        int nY = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == X)
                nX += 1;
            else if (A[i] == Y)
                nY += 1;
//            if (nX == nY)
            if ((nX != 0 || nY != 0) && (nX == nY))
                result = i;
        }
        return result;
    }

    static int findIndex(int X, int Y, int []arr) {
        int n = arr.length;
        int nx = 0, ny = 0;

        int result = -1;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == X)
                nx++;
            if (arr[i] == Y)
                ny++;
            if ((ny != 0 || nx != 0) && (nx == ny))
                result = i;
        }
        return result;
    }
}

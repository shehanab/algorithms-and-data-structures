package cacib;

public class IncorrectFindMinimum {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};

        System.out.println(find_min(solution(5)));
    }

    static int find_min(int[] A){
        int ans = 0;
        for(int i = 1; i < A.length; i++){
            if(ans > A[i]){
                ans = A[i];
            }
        }
        return ans;
    }


    static int[] solution(int N){

        int[] A = new int[N];

        for(int i = 0; i < A.length; i++){
            A[i] = i + 1 ;
        }


        return A;
    }

}

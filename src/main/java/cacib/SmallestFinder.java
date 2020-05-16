package cacib;

public class SmallestFinder {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};

        System.out.println(countSteps(input));
    }

    private static int countSteps(int[] input) {
        int count = 0, smallest = input[0];

    for (int i = 1; i < input.length; i++){
        count++;
        if(smallest > input[i]){
            smallest = input[i];
        }
    }
        System.out.println(smallest);

        return count;

    }


}

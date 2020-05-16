package cacib;

public class ValueZero {

    public static void main(String[] args) {

        System.out.println(valueZero("011100"));
    }


    private static int valueZero(String binaryString) {
        int decimalInput = Integer.parseInt(binaryString, 2);
        System.out.println(decimalInput);

        int count = 0;

        return reduceToZero(decimalInput, count);


    }


    private static int reduceToZero(int input, int count) {

        input = (input & 1) == 0 ? input/2 : input - 1;
        count++;
        if (input > 0) {
            count = reduceToZero(input, count);
        }

        return count;

    }
}

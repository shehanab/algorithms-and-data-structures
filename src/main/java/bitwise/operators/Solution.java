package bitwise.operators;

/**
 * Created by Shehan on 5/19/16.
 */
public class Solution {

    public static void main(String[] args) {
        leftShift(60);
        rightShift(60);

        System.out.println("");
        leftShift(2);
        System.out.println("");
        rightShift(2);
    }

    public static void leftShift(int input){
        System.out.println(input);
        System.out.println(Integer.toBinaryString(input));
        int result = input << 2;
        System.out.println(result);
        System.out.println(Integer.toBinaryString(result));
    }

    public static void rightShift(int input){
        System.out.println(input);
        System.out.println(Integer.toBinaryString(input));
        int result = input >> 2;
        System.out.println(result);
        System.out.println(Integer.toBinaryString(result));
    }

    /*
    * Usually bitwise operations are faster than doing multiply/divide. S
    * o if you need to  multiply a variable x by say 9, you will do (x<<3 + x)
    * which would be a few cycles faster than (x*9).
    * **/

}

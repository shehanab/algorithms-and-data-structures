package crmslgc;

import java.util.Arrays;
import java.util.Collections;

public class DecReprSeniorCoding {

    public static void main(String[] args) {

        System.out.println(solutions(213));
        System.out.println(solutions(553));

    }

    public static int solutions(int A) {
        char[] chars = String.valueOf(A).toCharArray();
        Arrays.sort(chars);
        String s = new String(chars);
        StringBuilder builder = new StringBuilder(s);
        builder = builder.reverse();
        return Integer.parseInt(builder.toString());
    }


}

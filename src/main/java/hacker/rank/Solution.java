package hacker.rank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Shehan on 6/7/16.
 */
public class Solution {
    public static void main(String[] args) {
        readInput();
    }

    public static void readInput() {
        String[] arr = {};
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input;
            while ((input = br.readLine()) != null) {
                arr = br.readLine().split(" ");
                System.out.println(arr);
            }


//                int[] array = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
            Object[] result = arrayReverse(arr);
            for (Object i : result) {
                System.out.println(i);
            }

        } catch (IOException io) {
            io.printStackTrace();
        }
    }

    public static Object[] arrayReverse(Object[] a) {
        Object temp;
        for (int i = 0; i < a.length / 2; i++) {
            temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
        return a;
    }

    public static ArrayList collectionsReverse(int[] a) {
        ArrayList temp = (ArrayList) Arrays.asList(a);
        Collections.reverse(temp);
        return temp;
    }
}

package crmslgc;

import com.sun.javafx.logging.JFRInputEvent;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLength {


    public static void main(String[] args) {
        int[] arr = {1, 4, -1, 3, 2};

        System.out.println(findLength(arr));
    }


    private static int findLen(int []a){
        List<Integer> arr = new ArrayList<>();
        int val = 0;

        for(int i = 0; i < a.length; i++){
            val = (i == 0) ? a[0] : a[val];
            arr.add(val);
            if(val == -1){
                break;
            }
        }
        return arr.size();
    }


    private static int findLength(int [] a) {
        int count = 1;
        int value = a[0];
        while (value!=-1) {
            value = a[value];
            count++;
        }
        return count;
    }
}

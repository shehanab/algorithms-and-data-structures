package hacker.rank;

/**
 * Created by Shehan on 6/8/16.
 */
public class ArrayShift {
    public static void main(String[] args) {
        int[] in = {1, 2, 3, 4, 5};
        int[] out = arrayShift(in, 2);
        for (int i : out)
            System.out.println(i);

    }

    public static int[] arrayShift(int[] in, int shiftBy) {
        int[] out = new int[in.length];

        for (int i = 0; i < in.length; i++) {
            int k = Math.floorMod(i + shiftBy, in.length);
            out[k] = in[i];
        }
        return out;
    }
}



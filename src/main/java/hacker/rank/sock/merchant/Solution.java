package hacker.rank.sock.merchant;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Shehan on 6/8/16.
 */
public class Solution {

    public static void main(String[] args) {

        int[] c = {1, 2, 1, 2, 1, 3, 2, 1};
        Set<Integer> colors = new HashSet<>();
        int pairs = 0;

        for (int i = 0; i < c.length; i++) {
            if (!colors.contains(c[i])) {
                colors.add(c[i]);
            } else {
                pairs++;
                colors.remove(c[i]);
            }
        }

        System.out.println(pairs);
    }

}

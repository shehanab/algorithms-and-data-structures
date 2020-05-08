package hacker.rank.sock.merchant;

import java.util.Arrays;

public class Test {

    static int pairEmSocks(int[] socks) {
        int pairCnt = 0;

        Arrays.sort(socks);

        for (int i = 0; i < socks.length - 1; ) {
            if (socks[i] == socks[i + 1]) {
                pairCnt++;
                i = i + 2;
            } else {
                i++;
            }
        }

        return pairCnt;
    }


    public static void main(String[] args) {
        int[] socks1 = {1, 2, 1, 2, 1, 3, 2, 1};
        int[] socks2 = {1, 2, 2, 1, 1, 3, 5, 1, 2};
        System.out.println(pairEmSocks(socks1));
        System.out.println(pairEmSocks(socks2));

    }
}

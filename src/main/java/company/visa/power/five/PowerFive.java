package visa.power.five;

public class PowerFive {

    public static void main(String[] args) {
        System.out.println(partition("110000110101101100101010000001011111001"));
        System.out.println(partition("11111001")); //1
        System.out.println(partition("101101101")); // 3
        System.out.println(partition("11001")); //1
        System.out.println(partition("11001101")); //2

    }

    public static int partition(String inp) {
        if (inp == null || inp.length() == 0)
            return 0;
        return partition(inp, inp.length(), 0);
    }

    public static int partition(String inp, int len, int index) {
        if (len == index)
            return 0;
        if (isPowerOfFive(inp, index))
            return 0;
        long sub = 0;
        int count = Integer.MAX_VALUE;
        for (int i = index; i < len; ++i) {
            sub = sub * 2 + (inp.charAt(i) - '0');
            if (isPowerOfFive(sub))
                count = Math.min(count, 1 + partition(inp, len, i + 1));
        }
        return count;
    }

    public static boolean isPowerOfFive(String inp, int index) {
        long sub = 0;
        for (int i = index; i < inp.length(); ++i) {
            sub = sub * 2 + (inp.charAt(i) - '0');
        }
        return isPowerOfFive(sub);
    }

    public static boolean isPowerOfFive(long val) {
        if (val == 0)
            return true;
        if (val == 1)
            return false;
        while (val > 1) {
            if (val % 5 != 0)
                return false;
            val = val / 5;
        }
        return true;
    }
}

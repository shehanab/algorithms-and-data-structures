package visa.twin.string;

public class TwinStringSolution {

    public static final String YES = "Yes";
    public static final String NO = "No";

    static String swap(String s) {
        char[] c = s.toCharArray();
        int loopLength = c.length % 2 == 0 || c.length == 3 ? c.length - 2 : c.length - 3;

        for (int i = 0; i < loopLength; i++) {
            if (c.length % 2 == 0) {
                char temp = c[i];
                c[i] = c[i + 2];
                c[i + 2] = temp;
            }
        }
        return new String(c);

    }

    static boolean[] twins(String[] a, String[] b) {
        boolean[] result = new boolean[a.length];

        for (int i = 0; i < a.length; i++) {
            String aVal = a[i].toLowerCase();
            String bVal = b[i].toLowerCase();
            String[] aValArray = aVal.split("");
            String[] bValArray = bVal.split("");

            for (String s : aValArray) {
                for (int index = 0; index < aValArray.length; index++) {
                    if (bValArray[index].equals(s)) { // checking whether the index match or not
                        if ((s.indexOf(s) % 2 == 0 && index % 2 == 0) || // checking even values
                                (s.indexOf(s) % 2 != 0 && index % 2 != 0)) {
                            result[i] = false;
                        } else if ((s.indexOf(s) % 2 == 0 && index % 2 != 0)
                                || (s.indexOf(s) % 2 != 0 && index % 2 == 0)) {
                            result[i] = true;
                            break;
                        }
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(swap("abcd"));
        System.out.println(swap("ab"));
        System.out.println(swap("abc"));

/*        String [] a = {"abcd", "abcd"};
        String [] b = {"cdab", "bcda"};*/

/*        String [] a  = {"cdab",  "dcba"};
        String [] b = {"abcd", "abcd"};*/

        String[] a = {"cdab", "dcba", "abcd"};
        String[] b = {"abcd", "abcd", "abcdcd"}; //yes no no

        // call twins function
        boolean[] results = twins(a, b);

        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i] ? "Yes" : "No");
        }
    }

    String isTwins(String a, String b) {
        if (a.length() != b.length()) {
            return NO;
        }

        char[] ac = a.toCharArray();
        char[] bc = b.toCharArray();

        for (int i = 0; i < a.length(); i++) {
            if (ac[i] != bc[i + 2]) {
                return NO;
            }


        }


        return NO;
    }
}

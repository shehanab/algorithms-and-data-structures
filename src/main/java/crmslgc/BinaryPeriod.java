package crmslgc;

public class BinaryPeriod {

    public static void main(String[] args) {
        System.out.println(solution(955));
        System.out.println(bugFix(955));
        System.out.println(solution(1000));
        System.out.println(bugFix(1000));
    }

    public static int solution(int n) {
        int[] d = new int[30];
        int l = 0;
        int p;
        while (n > 0) {
            d[l] = n % 2;
            n /= 2;
            l++;
        }
        for (p = 0; p < l; p++) {
            if (p <= l / 2) {
                int i;
                boolean ok = true;
                for (i = 0; i < l - p; i++) {
                    if (d[i] != d[i + p]) {
                        ok = false;
                        break;
                    }
                }
                if (ok) {
                    return p;
                }
            }
        }
        return -1;
    }


    public static int bugFix(int n) {
        int[] d = new int[30];
        int l = 0;
        int p;

        while (n > 0) {
            d[l] = n % 2;
            n /= 2;
            l++;
        }

        for (p = 1; p < 1 + l; p++) {
            int i;
            boolean ok = true;
            for (i = 0; i < l - p; i++) {
                if (d[i] != d[i + p]) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                return p;
            }
        }
        return -1;
    }

    public static int solutionBinaryPeriod(int N) {
        String binario = Integer.toBinaryString(N);
        int minimo = Integer.MAX_VALUE;

        int Q = binario.length();
        System.out.println("binario: " + binario);

        for (int P = 1; P < Q / 2; P++) {
            System.out.print("P: " + P);
            int delta = Q - P;
            int fail = 0;
            for (int K = 0; K < delta; K++) {
                System.out.print(" " + binario.charAt(K));
                if (binario.charAt(K) != binario.charAt(K + P)) {

                    K = delta;
                    fail = 1;
                }
            }
            System.out.println();
            if (fail != 1) {
                return P;
            }
        }

        if (minimo == Integer.MAX_VALUE) {
            return -1;
        }
        return minimo;
    }

}

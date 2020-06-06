package crmslgc;

public class BinaryGap {

    public static void main(String[] args) {
        System.out.println(solution(1041));
    }


    public static int solution(int number) {
        String binary = Integer.toBinaryString(number);
        String[] gaps = binary.split("1");

        String biggestGap = "";
        for (int i = 0; i < (binary.endsWith("1") ? gaps.length : gaps.length - 1); i++) {

            if (gaps[i].contains("0") && gaps[i].length() > biggestGap.length())
                biggestGap = gaps[i];
        }
        return biggestGap.length();
    }
}

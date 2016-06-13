package zoo.plus;

/**
 * Created by Shehan on 5/20/16.
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(solution("00-44   48 5555 83 61"));
//        System.out.println(solution("00-44   48 5555 83 "));
        System.out.println(solution("00-44   48 5555 83 1"));
    }

    public static String solution(String S) {
        S = S.replaceAll(" ", "").replaceAll("-", "");
        int stringLength = S.length();
        if (stringLength % 3 == 0) {
            return S.replaceAll("(.{3})(?!$)", "$1-");
        } else if (stringLength % 3 == 1) {
            return S.substring(0, stringLength - 4).replaceAll("(.{3})(?!$)", "$1-") + "-" + S.substring(stringLength - 4, stringLength).replaceAll("(.{2})(?!$)", "$1-");
        } else if (stringLength % 3 == 2) {
            return S.substring(0, stringLength - 2).replaceAll("(.{3})(?!$)", "$1-") + "-" + S.substring(stringLength - 2, stringLength);
        }

        return S;
    }
}

// When you learn a new technology best thing is surround yourself with ppl who are struggling with that just like you are

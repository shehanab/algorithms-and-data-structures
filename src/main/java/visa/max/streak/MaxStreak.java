package visa.max.streak;

public class MaxStreak {

    public static void main(String[] args) {
        System.out.println(maxStreak(4, new String[]{"YNYY", "YYYY", "YYNY", "NYYN"}));
    }

    static int maxStreak(int m, String[] data) {
        int curStreak = 0;
        int maxStreak = 0;

        for (String day : data) {
            for (int i = 0; i < m; i++) {
                for (char c : day.toCharArray()) {
                    if (c != 'Y') {
                        curStreak = 0;
                        break;
                    } else {
                        curStreak += 1;
                    }
                }
            }

        }

        maxStreak = Math.max(maxStreak, curStreak);
        return maxStreak;
    }
}

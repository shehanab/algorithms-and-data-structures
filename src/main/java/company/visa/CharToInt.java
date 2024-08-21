package visa;

public class CharToInt {

    public static void main(String[] args) {
        sizeOfArray("aA");

    }

    public static void sizeOfArray(String chars) {
        char[] charArray = chars.toCharArray();
        int max = 1;
        for (char c : charArray) {
            max = c;
            System.out.println(c + ": " + max);
        }
    }
}

package cacib;

public class StringReduce {

    public static void main(String[] args) {
        String input = "ACCAABBC";
        String input2 = "ABCBBCBA";
        String input3 = "BABABA";
        System.out.println(stringReduce(input));
        System.out.println(stringReduce(input2));
        System.out.println(stringReduce(input3));
    }

    public static String stringReduce(String s) {
        String transformed = s.replace("AA", "").replace("CC", "")
                .replace("BB", "");
        return transformed.equals(s) ? transformed : stringReduce(transformed);
    }
}

package crmslgc;

public class PhoneNumberFormatter {

    private static final String SEPARATOR = "-";

    public static void main(String[] args) {
        System.out.println(parse("00-44   48  5555 8361"));
        System.out.println(parse("0 - 22 1985--324"));
        System.out.println(parse("333 333"));
        System.out.println(parse("333 3331"));
        System.out.println(parse("333 33"));
        System.out.println("---------------");
        System.out.println(solution("00-44   48  5555 8361"));
        System.out.println(solution("0 - 22 1985--324"));
        System.out.println(solution("333 333"));
        System.out.println(solution("333 3331"));
        System.out.println(solution("333 33"));

    }


    public static String solution(String input) {
        input = input.replaceAll("[^\\d.]", "");
        int temp = 3;
        int times = input.length() / 3;
        int remains = input.length() % 3;
        if (remains < 2) times = times - 1;
        for (int i = 0; i < times; i++) {
            input = input.substring(0, temp) + "-" + input.substring(temp, input.length());
            temp += 4;
        }
        if (remains == 1) {
            temp -= 1;
            input = input.substring(0, temp) + "-" + input.substring(temp, input.length());
        }
        return input;
    }


    public static String parse(String input) {
        input = input.replaceAll("[^\\d.]", "");
        int inputLength = input.length();

        if (inputLength <= 3) {
            return input;
        } else {
            int mod3 = inputLength % 3;
            if (inputLength % 3 == 0) {
                return split3(input);
            } else if (mod3 == 1) {
                int baseEnd = inputLength - 4;
                String base = split3(input.substring(0, baseEnd));
                String suffix = split2(input.substring(baseEnd, inputLength));
                return base + "-" + suffix;
            } else {
                int baseEnd = inputLength - 2;
                String base = split3(input.substring(0, baseEnd));
                String suffix = input.substring(baseEnd, inputLength);
                return base + "-" + suffix;
            }
        }
    }

    private static String split2(String input) {
        return splitTemplate(input, 2);
    }

    private static String split3(String input) {
        return splitTemplate(input, 3);
    }

    private static String splitTemplate(String input, int splitSize) {
        StringBuilder result = new StringBuilder();
        int length = input.length();
        for (int i = 0; i < length; i += splitSize) {
            String sub = input.substring(i, i + splitSize);
            result.append(sub);
            if (i != length - splitSize) {
                result.append(SEPARATOR);
            }
        }
        return result.toString();
    }

}

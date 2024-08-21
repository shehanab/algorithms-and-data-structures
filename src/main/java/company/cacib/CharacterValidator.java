package cacib;

public class CharacterValidator {

    public static void main(String[] args) {
        String input1 = "Shehan";
        String input2 = "shehan";
        String input3 = "5hehan";
        String input4 = "$hehan";
        System.out.println(validateFirstChar(input1));
        System.out.println(validateFirstChar(input2));
        System.out.println(validateFirstChar(input3));
        System.out.println(validateFirstChar(input4));
    }

    private static String validateFirstChar(String input) {
        char c = input.charAt(0);

        if (Character.isUpperCase(c)) {
            return "upper";
        } else if (Character.isLowerCase(c)) {
            return "lower";
        } else if (Character.isDigit(c)) {
            return "digit";
        } else {
            return "other";
        }

    }


}

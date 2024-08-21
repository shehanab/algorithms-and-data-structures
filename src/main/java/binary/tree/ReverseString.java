package binary.tree;

public class ReverseString {

    String reverseString(String input) {
//        return new StringBuilder(input).reverse().toString();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            stringBuilder.append(input.charAt(i));
        }
        return stringBuilder.toString();
    }

}

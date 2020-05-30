package hacker.rank;

import java.util.Stack;

public class BalancedParenthesis {

    public static char[][] TOKENS = {{'{', '}'}, {'[', ']'}, {'(', ')'}};

    public static void main(String[] args) {
        System.out.println(isBalanced("{{[()]}}"));
        System.out.println(isBalanced("{{[()[}}"));
    }

    private static boolean isBalanced(String value) {
        Stack<Character> stack = new Stack<>();
        for (Character c : value.toCharArray()) {
            if (isOpenTerm(c)) {
                stack.push(c);
            } else if (stack.isEmpty() || !matches(stack.pop(), c)) {
                return false;
            }

        }
        return stack.isEmpty();
    }

    private static boolean matches(Character openTerm, Character closeTerm) {
        for (char[] arr : TOKENS) {
            if (arr[0] == openTerm) {
                return arr[1] == closeTerm;
            }
        }
        return false;
    }

    private static boolean isOpenTerm(Character c) {
        for (char[] arr : TOKENS) {
            if (arr[0] == c)
                return true;
        }
        return false;
    }

}

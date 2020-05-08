package nested.strings;

import java.util.Stack;

/**
 * Created by Shehan on 5/19/16.
 */
public class NestedString {

    public static void main(String[] args) {
        System.out.println(isNested("{[()()]}"));
    }

    private static boolean isValidPair(char left, char right) {
        if (left == '(' && right == ')') {
            return true;
        } else if (left == '[' && right == ']') {
            return true;
        } else return left == '{' && right == '}';
    }

    private static int isNested(String s) {
        char[] word = s.toCharArray();
        Stack<Character> letterStack = new Stack<Character>();
        if (word.length < 2) {
            return 0;
        }

        for (int i = 0; i < word.length; i++) {
            if ("{".charAt(0) == (word[i]) || "[".charAt(0) == (word[i]) || "(".charAt(0) == (word[i])) {
                letterStack.push(word[i]);
            } else {
                if (letterStack.size() == 0) return 0;
                if (!isValidPair(letterStack.pop(), word[i])) return 0;
            }
        }

        if (letterStack.empty()) return 1;

        return 0;

    }
}

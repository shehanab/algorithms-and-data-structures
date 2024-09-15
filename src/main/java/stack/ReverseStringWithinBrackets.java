package stack;

import java.util.Stack;

public class ReverseStringWithinBrackets {

    public static String reverseParentheses(String str) {
        Stack<StringBuilder> stack = new Stack<>();
        StringBuilder currentString = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                // Push the current string into the stack and start a new one
                stack.push(currentString);
                currentString = new StringBuilder();
            } else if (ch == ')') {
                // Reverse the current string and append it to the previous one
                currentString.reverse();
                currentString = stack.pop().append(currentString);
            } else {
                // Append the current character to the current string
                currentString.append(ch);
            }


        }

        System.out.println(stack);
        System.out.println(currentString);

        return currentString.toString();
    }

    public static void main(String[] args) {
        String str1 = "(skeeg(for)skeeg)";
        System.out.println(reverseParentheses(str1));  // Output: geeksforgeeks

        String str2 = "((ng)ipm(ca))";
        System.out.println(reverseParentheses(str2));  // Output: camping
    }


}

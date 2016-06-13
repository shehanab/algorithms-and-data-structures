package hacker.rank.stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Shehan on 6/7/16.
 */

class Solution {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            //Complete the code
            System.out.println(isNested(input));
        }

    }

    private static boolean isValidPair(char left, char right) {
        return left == '(' && right == ')' || left == '[' && right == ']' || left == '{' && right == '}';
    }

    private static int isNested(String s) {
        char[] word = s.toCharArray();
        Stack<Character> letterStack = new Stack<Character>();

        if (word.length < 2 || word.length % 2 != 0) {
            return 0;
        }


        for (char aWord : word) {
            if ("{".charAt(0) == (aWord) || "[".charAt(0) == (aWord) || "(".charAt(0) == (aWord)) {
                letterStack.push(aWord);
            } else if (letterStack.size() == 0 || !isValidPair(letterStack.pop(), aWord)) {
                return 0;
            }
        }

        return 1;

    }
}




/*
import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;
class Parser
{
    private static final Map<Character, Character> brackets = new HashMap<Character, Character>();
    static {
        brackets.put('[', ']');
        brackets.put('{', '}');
        brackets.put('(', ')');
    }


    boolean checkParenthesesBalance(String str)
    {
        if (str.length() == 0) {
            throw new IllegalArgumentException("String length should be greater than 0");
        }
        // odd number would always result in false
        if ((str.length() % 2) != 0) {
            return false;
        }

        final Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            if (brackets.containsKey(str.charAt(i))) {
                stack.push(str.charAt(i));
            } else if (stack.empty() || (str.charAt(i) != brackets.get(stack.pop()))) {
                return false;
            }
        }
        return true;
    }
}
class Solution{

    public static void main(String []argh)
    {
        Parser X=new Parser();
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            System.out.println(X.checkParenthesesBalance(in.next()));
        }

    }
}*/

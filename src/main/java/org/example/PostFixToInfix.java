package org.example;

import java.util.Stack;

public class PostFixToInfix {
    public static String Q7Main() {
        Stack<String> stack = new Stack<>();
        String postfix = "abc-+de-fg-h+/*";

        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
                String op2 = stack.pop();
                String op1 = stack.pop();
                String exp = "(" + op1 + " " + c + " " + op2 + ")";
                stack.push(exp);
            } else if (c != ' ') {
                stack.push(String.valueOf(c));
            }
        }

        return stack.pop();
    }
}

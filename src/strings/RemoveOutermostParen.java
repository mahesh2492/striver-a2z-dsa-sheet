package strings;

import java.util.Stack;

/*
https://leetcode.com/problems/remove-outermost-parentheses/description/
 */
public class RemoveOutermostParen {
    public static String removeOuterParentheses(String s) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char first = s.charAt(i);
            if(first == '(') {
                if(!stack.isEmpty()) {
                    answer = answer + first;
                }
                stack.push(first);
            } else {
                if(first == ')') {
                    stack.pop();
                    if(!stack.isEmpty()) {
                        answer = answer + first;
                    }

                }
            }
        }

        return answer;
    }

    public static String removeOuterParenthesesV2(String s) {
        String answer = "";
        int openParen = 0;
        for(int i = 0; i < s.length(); i++) {
            char first = s.charAt(i);
            if(first == '(') {
                if(openParen > 0) {
                    answer = answer + first;
                }
                openParen++;
            } else {
                if(first == ')') {
                    --openParen;
                    if(openParen > 0) {
                        answer = answer + first;
                    }

                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "((()))(()())";
        System.out.println(removeOuterParentheses(s));
        System.out.println(removeOuterParenthesesV2(s));
    }
}


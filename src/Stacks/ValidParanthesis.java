package Stacks;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String str = "()({[]})";
        System.out.println(CheckValid(str));
    }

    public static boolean CheckValid(String str) {
        Stack<Character> s = new Stack();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
                s.push(str.charAt(i));
            }

            if((s.peek() == '(' && str.charAt(i) == ')') || (s.peek() == '{' && str.charAt(i) == '}')
            || (s.peek() == '[' && str.charAt(i) == ']')){
                s.pop();
            }
        }
            if(s.isEmpty()) return true;
            return false;
    }
}

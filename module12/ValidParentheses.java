package com.tripillar_coding_assignment.module12;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s1="{[()]}";
        String s2="{{}}";
        String s3="{{}]}[";
        System.out.println(validParentheses(s1));
        System.out.println(validParentheses(s2));
        System.out.println(validParentheses(s3));
    }
    public static boolean validParentheses(String s){
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='{'||c=='['||c=='('){
                stack.push(c);
            }else {
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if(c=='}' && top!='{') return false;
                if(c==')' && top!='(') return false;
                if(c==']' && top!='[') return false;
            }
        }
        return stack.isEmpty();
    }
}

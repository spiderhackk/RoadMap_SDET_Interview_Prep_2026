package String_Manipulation;

import java.util.Stack;

public class Valid_Parentheses {
    public static boolean validParentheses(String str){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='['){
                    stack.push(str.charAt(i));

            }
            else{

                if (str.charAt(i)==')' || str.charAt(i)=='}' || str.charAt(i)==']') {
                        char top = stack.peek();
                        if((str.charAt(i)==')' && top!='(') || (str.charAt(i)=='}' && top!='{') || (str.charAt(i)==']' && top!='[')){
                            return false;
                        }
                        stack.pop();
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "(){}[]";
       System.out.println(validParentheses(str));
    }
}

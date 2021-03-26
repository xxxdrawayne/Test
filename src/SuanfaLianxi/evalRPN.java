package SuanfaLianxi;

import java.util.Stack;

/**
 * @author ywt
 * @version 1.0
 * @date 2021/3/20 17:22
 */
//逆波兰表达式
public class evalRPN {
    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<tokens.length; i++) {
            int res = 0,num1,num2;
            if(tokens[i].equals("+")) {
                num1 = stack.pop();
                num2 = stack.pop();
                res = num2 + num1;
                stack.push(res);
            }
            else if(tokens[i].equals("-")) {
                num1 = stack.pop();
                num2 = stack.pop();
                res = num2 - num1;
                stack.push(res);
            }
             else if(tokens[i].equals("*")) {
                num1 = stack.pop();
                num2 = stack.pop();
                res = num2 * num1;
                stack.push(res);
             }
            else if(tokens[i].equals("/")) {
                num1 = stack.pop();
                num2 = stack.pop();
                res = num2 / num1;
                stack.push(res);
            }
            else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }

        return stack.pop();
    }
}

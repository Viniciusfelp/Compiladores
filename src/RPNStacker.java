import java.util.Stack;
import java.util.StringTokenizer;

public class RPNStacker {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("4 8 + 3 *");
        Stack<String> stack = new Stack<String>();
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (token.equals("+")) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                 stack.push(String.valueOf(a + b));

            }else if (token.equals("*")) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(a * b));

            }else if (token.equals("-")) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(b - a));

            }else if (token.equals("/")) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(b / a));
            }else {
                stack.push(token);
            }

        }
        System.out.println(stack.pop());
    }
}

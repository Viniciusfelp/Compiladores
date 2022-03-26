package RPN;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Stack;
import java.util.StringTokenizer;

public class RPNStacker {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/Calc1.stk");
        String content = new String(Files.readAllBytes(path));
        StringTokenizer st = new StringTokenizer(content, "\r\n");
        Stack<String> stack = new Stack<>();
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (token.equals("+")) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(a + b));
            } else if (token.equals("*")) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(a*b));
            } else if (token.equals("-")) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(b - a));
            } else if (token.equals("/")) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(b / a));
            } else {
                stack.push(token);
            }

        }
        System.out.println(stack.pop());
    }
}

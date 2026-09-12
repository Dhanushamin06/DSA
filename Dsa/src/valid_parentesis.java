import java.util.*;

public class valid_parentesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        try {
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == '(') {
                    stack.push(')');

                } else if (ch == '{') {
                    stack.push('}');
                } else if (ch == '[') {
                    stack.push(']');
                } else {
                    if (!stack.isEmpty() && stack.peek() != ch) {
                        return false;
                    }
                    stack.pop();
                }

            }
        } catch (Exception e) {
            return false;

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isValid(s));
    }
}

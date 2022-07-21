import java.util.Stack;

public class _20_Leetcode {
    public static void main(String[] args) {

    }
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //System.out.println(c);
//            char firstChar = stack.peek();
//            System.out.println(firstChar);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                //System.out.println("stack.push: " + stack);
            } else if (c == ')'&& stack.isEmpty() && stack.peek() == '(' || c == '}' && stack.isEmpty() && stack.peek() == '{' || c == ']' && stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
                //System.out.println("stack.pop: " + stack);
            }

        }
        return stack.isEmpty();
    }
}

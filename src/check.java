import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class check {
    public static void main(String[] args) {
      System.out.println(check( "[()]"))  ; // true
        System.out.println(check( "(()[])")); // true
        System.out.println(check( "([)]")); // false
        System.out.println(check( "((")); // false
        System.out.println(check( "[(()])")); // false

        System.out.println(check( "([(([[(([]))]]))])")); // true
        System.out.println(check( "[](()()[[]])()[]([])")); // true
        System.out.println(check( "([((([(([]))])))))])")); // false
        System.out.println(check( "[](()()[[]])[][[([])")); // false
    }

    public static boolean check(String v) {
        if (v == null || v.isEmpty()) return true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < v.length(); ++i) {
            char c = v.charAt(i);
            if (c == '(' || c == '[') {
                stack.push(c);
            } else if (stack.isEmpty()) {
                return false;
            } else if ((stack.peek() == '(' && c == ')') || (stack.peek() == '[' && c == ']')) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}



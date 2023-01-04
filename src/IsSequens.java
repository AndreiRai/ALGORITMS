import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class IsSequens {

    public static void main(String[] args) {
        System.out.println(isSequensCorrIncorr("([{}])")); // t
        //System.out.println(isSequensCorrIncorr("{()[]}")); // t
        System.out.println(isSequensCorrIncorr("([)]")); // f
        System.out.println(isSequensCorrIncorr("{()]")); // f
        //System.out.println(isSequensCorrIncorr("{()()[[()]()]}")); // t

    }

    public static boolean isSequensCorrIncorr(String s) {
        // Deque<Character> charDeque = new LinkedList<>();
        // String sequens = new String();
        Stack<Character> abc = new Stack<>();
        for (char tmpChar : s.toCharArray()) {
            if (tmpChar == '(' || tmpChar == '[' || tmpChar == '{')
                abc.push(tmpChar);
            else if (tmpChar == ')' && abc.peek() == '(' || tmpChar == ']' && abc.peek() == '[' || tmpChar == '}' && abc.peek() == '{')
                abc.pop();

        }
        return abc.empty();
    }
}
//Algoritms


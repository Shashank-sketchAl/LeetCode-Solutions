import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> ch = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                ch.push(c);
            } 
            else {
                if (ch.isEmpty()) {
                    return false;
                }

                char top = ch.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        return ch.isEmpty(); 
    }
}

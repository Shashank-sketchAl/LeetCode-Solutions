class Solution {
    public String removeDuplicateLetters(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        
        boolean[] inStack = new boolean[26];
        StringBuilder stack = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            count[ch - 'a']--; 
            
            if (inStack[ch - 'a']) {
                continue;
            }
            
 
            while (stack.length() > 0) {
                char last = stack.charAt(stack.length() - 1);
                if (last > ch && count[last - 'a'] > 0) {
                    inStack[last - 'a'] = false;
                    stack.deleteCharAt(stack.length() - 1);
                } else {
                    break;
                }
            }
            
            stack.append(ch);
            inStack[ch - 'a'] = true;
        }
        
        return stack.toString();
    }
}

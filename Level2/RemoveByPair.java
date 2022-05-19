import java.util.Stack;

class Solution {
    public int solution(String s) {
        
        /*
         * https://programmers.co.kr/learn/courses/30/lessons/12973#
         */
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            if(stack.empty()) {
                stack.push(s.charAt(i));
                continue;
            }
            if(stack.peek() == s.charAt(i)) {
                stack.pop();
                continue;
            }
            stack.push(s.charAt(i));
        }
        
        if(stack.empty()) {
            return 1;
        }

        return 0;
    }
}

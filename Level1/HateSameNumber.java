import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        /*
         * https://school.programmers.co.kr/learn/courses/30/lessons/12906
         */
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(stack.isEmpty()) {
                stack.push(arr[i]);
            } else {
                if(stack.peek() != arr[i]) {
                    stack.push(arr[i]);
                }
                
            }
        }
        
        int[] answer = new int[stack.size()];
        
        for(int i = answer.length-1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}

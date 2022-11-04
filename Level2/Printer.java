import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {

				/*
				 * https://school.programmers.co.kr/learn/courses/30/lessons/42587
				 */

        int answer = 0;
        
        Queue<Integer> queue = new LinkedList<>();
        PriorityQueue<Integer> priority = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0; i < priorities.length; i++) {
            queue.add(priorities[i]);
            priority.add(priorities[i]);
        }
        
        while(!queue.isEmpty()) {
            
            if(priority.peek() > queue.peek()) {
                queue.add(queue.poll());
                location -= 1;
                if(location < 0) {
                    location = queue.size()-1;
                }
            } else {
                answer++;
                queue.remove();
                priority.remove();
                location -= 1;
                if(location < 0) {
                    break;
                }
            }
            
        }
        
        return answer;
    }
    
}

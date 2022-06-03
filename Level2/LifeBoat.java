import java.util.*;

class LifeBoat {
    public int solution(int[] people, int limit) {
        
        /*
         * https://programmers.co.kr/learn/courses/30/lessons/42885
         */
        
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < people.length; i++) {
            list.add(people[i]);
        }
        
        Collections.sort(list);
        
        Deque<Integer> deque = new ArrayDeque<>(50000);
        for(int i = 0; i < list.size(); i++) {
            deque.add(list.get(i));
        }
        
        while(!deque.isEmpty()) {
            answer++;
            int weight = deque.pollLast();
            if(!deque.isEmpty() && weight + deque.peekFirst() <= limit) {
                deque.pollFirst();
            }
        }
        
        return answer;
    }
}

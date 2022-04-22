import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Solution {
    public int solution(int[] numbers) {

	/*
	 * https://programmers.co.kr/learn/courses/30/lessons/86051
	 */

        int answer = 0;

        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i <= 9; i++) {
            map.put(i,i);
        }

        for(int i = 0; i < numbers.length; i++) {
            if(map.containsKey(numbers[i])) {
                map.remove(numbers[i]);
            }
        }

        for(Integer key : map.keySet()) {
            answer += map.get(key);
        }

        return answer;
    }
}

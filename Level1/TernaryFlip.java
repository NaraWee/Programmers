import java.util.*;
import java.lang.*;
class Solution {
    public int solution(int n) {
        
        /*
         * https://programmers.co.kr/learn/courses/30/lessons/68935
         */
        
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        while(n >= 1) {
            list.add(n%3);
            n = n/3;
        }
        
        int i = 0;
        for(Integer num : list) {
            answer += Math.pow(3,list.size()-i-1) * num;
            i++;
        }
        
        return answer;
    }
}

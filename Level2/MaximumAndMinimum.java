import java.util.*;

class Solution {
    public String solution(String s) {
        
        /*
         * https://programmers.co.kr/learn/courses/30/lessons/12939
         */
        
        String[] numbers = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < numbers.length; i++) {
            if(Integer.parseInt(numbers[i]) > max) {
                max = Integer.parseInt(numbers[i]);
            }
            if(Integer.parseInt(numbers[i]) < min) {
                min = Integer.parseInt(numbers[i]);
            }
        }
        
        return min + " " + max;
    }
}

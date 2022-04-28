import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        /*
         * https://programmers.co.kr/learn/courses/30/lessons/12935?language=java
         */
        
        if(arr.length == 1) {
            int[] result = {-1};
            return result;
        }
        
        int tmp = Integer.MAX_VALUE;
        int index = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            if(arr[i] < tmp) {
                tmp = arr[i];
                index = i;
            }
        }
        
        list.remove(index);
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}

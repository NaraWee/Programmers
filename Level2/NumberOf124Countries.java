import java.util.*;

class Solution {
    public String solution(int n) {
        
        /*
         * https://programmers.co.kr/learn/courses/30/lessons/12899
         */
        
        String answer = "";
        
        List<Integer> list = new ArrayList<>();
        do{
            if(n%3 == 0) {
                list.add(3);
                n = n/3 - 1;
            } else {
                list.add(n%3);
                n /= 3;
            }
        }
        while(n >= 1);
        
        for(int i = list.size()-1; i >= 0; i--) {
            switch(list.get(i)) {
                case 1 : answer += "1"; break;
                case 2 : answer += "2"; break;
                case 3 : answer += "4"; break;
            }
        }
        
        return answer;
    }
}

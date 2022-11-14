import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        
        /*
         * https://school.programmers.co.kr/learn/courses/30/lessons/43163
         */
        
        int answer = 0;
        
        boolean[] check = new boolean[words.length];
        
        List<String> wordList = new ArrayList<>(Arrays.asList(words));
        if(!wordList.contains(target)) {
            return 0;
        }
        
        while(!target.equals(begin)) {
            
            for(int i = 0; i < words.length; i++) {
                if(check[i]) {
                    continue;
                }
                
                int matchWord = 0;
                int targetMatch = 0;
                
                for(int j = 0; j < target.length(); j++) {
                    
                    if(begin.charAt(j) == target.charAt(j)) {
                        targetMatch += 1;
                    }
                    
                    if(begin.charAt(j) == words[i].charAt(j)) {
                        matchWord += 1;
                    }
                    
                }
                
                if(targetMatch == target.length() - 1) {
                    check[i] = true;
                    answer += 1;
                    begin = target;
                    break;
                }
                
                if(matchWord == target.length() - 1) {
                    check[i] = true;
                    answer += 1;
                    begin = words[i];
                }
            }
        }
        
        return answer;
    }
}

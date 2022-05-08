class Solution {
    boolean solution(String s) {
        
        /*
         * https://programmers.co.kr/learn/courses/30/lessons/12909
         */
        
        boolean answer = true;        
        int cnt = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                cnt++;
            } else {
                cnt--;
            }
            if(cnt < 0) {
                return false;
            }
        }
        
        if(cnt != 0) {
            answer = false;
        }

        return answer;
    }
}

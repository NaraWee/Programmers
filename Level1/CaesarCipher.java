class Solution {
    public String solution(String s, int n) {
        
        /*
         * https://programmers.co.kr/learn/courses/30/lessons/12926
         */
        
        String answer = "";
        char tmp;
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                answer += s.charAt(i);
                continue;
            }
            
            tmp = (char) (s.charAt(i) + n);
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z' && tmp > 'z') || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' && tmp > 'Z') {
                tmp = (char) (tmp - 26);
            }
            answer += tmp;
        }
        
        return answer;
    }
}

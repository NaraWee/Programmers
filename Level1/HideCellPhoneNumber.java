class Solution {
    public String solution(String phone_number) {
        
        /*
         * https://programmers.co.kr/learn/courses/30/lessons/12948
         */
        
        String answer = "";
        
        for(int i = 0; i < phone_number.length(); i++) {
            if(i < phone_number.length() - 4) {
                answer += '*';
            } else {
                answer += phone_number.charAt(i);
            }
        }
        
        return answer;
    }
}
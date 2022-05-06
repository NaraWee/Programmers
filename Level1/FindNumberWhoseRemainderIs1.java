class Solution {
    public int solution(int n) {
        
        /*
         * https://programmers.co.kr/learn/courses/30/lessons/87389
         */
        
        int answer = 0;
        
        for(int i = 2; i < n; i++) {
            if(n%i == 1) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}

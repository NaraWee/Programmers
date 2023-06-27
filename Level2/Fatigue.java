import java.util.*;

class Solution {
    
    /*
     * https://school.programmers.co.kr/learn/courses/30/lessons/42578
     */
    
    public int solution(int k, int[][] dungeons) {
        int answer = 0;

        boolean[] isVisit = new boolean[dungeons.length];
        answer = checkCount(k, dungeons, isVisit, answer);

        return answer;
    }

    public int checkCount(int k, int[][] dungeons, boolean[] isVisit, int answer) {
        for(int i = 0; i < dungeons.length; i++) {
            if(!isVisit[i]) {
                if(dungeons[i][0] <= k) {
                    isVisit[i] = true;
                    answer = checkCount(k-dungeons[i][1], dungeons, isVisit, answer);
                    isVisit[i] = false;
                }
            }
        }

        int visitCount = 0;
        for(int i = 0; i < isVisit.length; i++) {
            if(isVisit[i]) {
                visitCount++;
            }
        }
        return Math.max(visitCount, answer);
    }
}

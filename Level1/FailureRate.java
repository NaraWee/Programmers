import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int N, int[] stages) {

				/*
         * https://programmers.co.kr/learn/courses/30/lessons/42889
         */

        Double[] failRate = new Double[N];
        Double[] failRateTmp = new Double[N];
        int[] answer = new int[N];

        for(int i = 1; i <= N; i++) {
            int player = 0;
            int fail = 0;
            for(int j = 0; j < stages.length; j++) {
                if(stages[j] >= i) {
                    player++;
                    if(stages[j] == i) {
                        fail++;
                    }
                }
            }

            if(fail == 0) {
                failRate[i-1] = (double)0;
                failRateTmp[i-1] = (double)0;
            } else {
                failRate[i-1] = (double)fail/player;
                failRateTmp[i-1] = (double)fail/player;
            }
        }

        Arrays.sort(failRate, Collections.reverseOrder());

        for(int i = 0; i < failRate.length; i++) {
            for(int j = 0; j < failRateTmp.length; j++) {
                if(failRateTmp[j].equals(failRate[i])) {
                    answer[i] = j+1;
                    failRateTmp[j] = (double)-1;
                    break;
                }
            }
        }

        return answer;
    }
}

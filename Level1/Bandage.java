class Solution {
		public int solution(int[] bandage, int health, int[][] attacks) {

				/*
         * https://school.programmers.co.kr/learn/courses/30/lessons/250137
         */

        int answer = health;

        int second = 0;
        for(int i = 0; i < attacks.length; i++) {
            int healCount = 1;
            while(true) {
                second++;
                if(second == attacks[i][0]) {
                    answer = answer - attacks[i][1];
                    if(answer <= 0) {
                        return -1;
                    }
                    break;
                }
                if(answer < health) {
                    if (healCount < bandage[0]) {
                        answer = answer + bandage[1];
                        if (answer > health) {
                            answer = health;
                        }
                        healCount++;
                    } else if (healCount == bandage[0]) {
                        answer = answer + bandage[1] + bandage[2];
                        if (answer > health) {
                            answer = health;
                        }
                        healCount = 0;
                    }
                }
            }

        }
        return answer;
    }
}

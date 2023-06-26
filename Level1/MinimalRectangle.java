class Solution {
    public int solution(int[][] sizes) {
        
        /*
         * https://school.programmers.co.kr/learn/courses/30/lessons/86491
         */
        
        int longLine = 0;
        int shortLine = 0;

        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] > sizes[i][1]) {
                if(sizes[i][0] > longLine) {
                    longLine = sizes[i][0];
                }
                if(sizes[i][1] > shortLine) {
                    shortLine = sizes[i][1];
                }
            } else {
                if(sizes[i][1] > longLine) {
                    longLine = sizes[i][1];
                }
                if(sizes[i][0] > shortLine) {
                    shortLine = sizes[i][0];
                }
            }
        }

        return longLine*shortLine;
    }
}

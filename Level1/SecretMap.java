import java.lang.Math;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
        /*
         * https://programmers.co.kr/learn/courses/30/lessons/17681
         */
        
        String[] answer = new String[n];
        
        String[][] tmpAnswer = new String[n][n];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(arr1[i]-Math.pow(2,(n-1-j)) >= 0 && arr2[i]-Math.pow(2,(n-1-j)) >= 0) {
                    arr1[i] -= Math.pow(2,(n-1-j));
                    arr2[i] -= Math.pow(2,(n-1-j));
                    tmpAnswer[i][j] = "#";
                } else if(arr1[i]-Math.pow(2,(n-1-j)) >= 0 && arr2[i]-Math.pow(2,(n-1-j)) < 0) {
                    arr1[i] -= Math.pow(2,(n-1-j));
                    tmpAnswer[i][j] = "#";
                } else if(arr1[i]-Math.pow(2,(n-1-j)) < 0 && arr2[i]-Math.pow(2,(n-1-j)) >= 0) {
                    arr2[i] -= Math.pow(2,(n-1-j));
                    tmpAnswer[i][j] = "#";
                } else {
                    tmpAnswer[i][j] = " ";
                }
            }
        }
        
        for(int i = 0; i < n; i++) {
            String s = "";
            for(int j = 0; j < n; j++) {
                s += tmpAnswer[i][j];
            }
            answer[i] = s;
        }
        
        return answer;
    }
}

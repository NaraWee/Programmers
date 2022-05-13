import java.util.*;

class CreateMinimumValue {
    public int solution(int []A, int []B) {
        
        /*
         * https://programmers.co.kr/learn/courses/30/lessons/12941
         */
        
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length-1 - i];
        }

        return answer;
    }
}

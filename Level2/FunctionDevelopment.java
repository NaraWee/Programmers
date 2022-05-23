import java.util.*;

class FunctionDevelopment {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        
        /*
         * https://programmers.co.kr/learn/courses/30/lessons/42586
         */
        
        List<Integer> answer = new ArrayList<>();
        
        int[] publishDay = new int[progresses.length];
        for(int i = 0; i < progresses.length; i++) {
            if((100 - progresses[i]) % speeds[i] == 0) {
                publishDay[i] = (100 - progresses[i]) / speeds[i];
            } else {
                publishDay[i] = (100 - progresses[i]) / speeds[i] + 1;
            }
        }
        
        int day = publishDay[0];
        int cnt = 1;
        for(int i = 1; i < publishDay.length; i++) {
            if(day >= publishDay[i]) {
                cnt++;
            } else {
                answer.add(cnt);
                day = publishDay[i];
                cnt = 1;
            }
            if(i == publishDay.length - 1) {
                answer.add(cnt);
            }
        }
        
        return answer;
    }
}

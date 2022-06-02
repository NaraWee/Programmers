import java.util.*;

class EnglishWordRelay {
    public int[] solution(int n, String[] words) {
        
        /*
         * https://programmers.co.kr/learn/courses/30/lessons/12981
         */
        
        int no = 0;
        int turn = 0;

        HashSet<String> set = new HashSet<>();
        set.add(words[0]);
        for(int i = 1; i < words.length; i++) {
            if(set.contains(words[i]) || !words[i-1].substring(words[i-1].length()-1).equals(words[i].substring(0,1))) {
                if((i+1)%n == 0) {
                    no = n;
                    turn = (i+1)/n;
                } else {
                    no = (i+1)%n;
                    turn = (i+1)/n+1;
                }
                break;
            } else {
                set.add(words[i]);
            }
        }
        
        int[] answer = {no, turn};
        
        return answer;
    }
}

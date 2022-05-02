import java.lang.*;
import java.util.*;

class DartsGame {
    public int solution(String dartResult) {
        
        /*
         * https://programmers.co.kr/learn/courses/30/lessons/17682#
         */
        
        int answer = 0;
        
        List<String> list = new ArrayList<>();
        for(int i = 0; i < dartResult.length(); i++) {
            if(dartResult.charAt(i) >= 48 && dartResult.charAt(i) <= 57) {
                if(dartResult.charAt(i+1) >= 48 && dartResult.charAt(i+1) <= 57) {
                    list.add(Character.toString(dartResult.charAt(i)) + Character.toString(dartResult.charAt(i+1)));
                    i++;
                    continue;
                }
                list.add(Character.toString(dartResult.charAt(i)));
                continue;
            }
            list.add(Character.toString(dartResult.charAt(i)));
        }
        
        int beforeScore = 0;
        for(int i = 0; i < list.size(); i=i+2) {
            int score = 0;
            if(list.get(i+1).equals("S")) {
                score = (int) Math.pow(Integer.parseInt(list.get(i)),1);
            } else if(list.get(i+1).equals("D")) {
                score = (int) Math.pow(Integer.parseInt(list.get(i)),2);
            } else if(list.get(i+1).equals("T")) {
                score = (int) Math.pow(Integer.parseInt(list.get(i)),3);
            }
            
            if(i+2 < list.size()) {
                if(list.get(i+2).equals("*")) {
                    if(i == 0) {
                        score = score*2;
                        i++;
                    } else {
                        answer += beforeScore;
                        score = score*2;
                        i++;
                    }
                } else if(list.get(i+2).equals("#")) {
                    score = (-1) * score;
                    i++;
                }
            }
            
            beforeScore = score;
            answer += score;
        }
        
        return answer;
    }
}

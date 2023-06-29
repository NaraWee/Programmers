import java.util.*;

class Solution {
    
    /*
     * https://school.programmers.co.kr/learn/courses/30/lessons/43164
     */
    
    public String[] solution(String[][] tickets) {
        String[] answer;

        List<String> path = new ArrayList<>();
        List<String> answerList = new ArrayList<>();
        boolean[] check = new boolean[tickets.length];
        boarding(tickets, check, "ICN", path, answerList);
        
        answer = answerList.toArray(new String[answerList.size()]);

        return answer;
    }

    public void boarding(String[][] tickets, boolean[] check, String depart, List<String> path, List<String> answerList) {
        path.add(depart);

        int cnt = 0;
        for(boolean b : check) {
            if(b) cnt++;
        }
        if(cnt == check.length) {
            if(answerList.size() == 0) {
                answerList.addAll(path);
            } else {
                for(int i = 0; i < path.size()-1; i++) {
                    if(!path.get(i).equals(answerList.get(i))) {
                        if (path.get(i).compareTo(answerList.get(i)) < 0) {
                            answerList.clear();
                            answerList.addAll(path);
                        }
                        break;
                    }
                }
            }
            return;
        }

        for(int i = 0; i < tickets.length; i++) {
            if(!check[i] && depart.equals(tickets[i][0])) {
                check[i] = true;
                boarding(tickets, check, tickets[i][1], path, answerList);
                check[i] = false;
                path.remove(path.size()-1);
            }
        }
    }
}

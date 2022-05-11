import java.util.*;

class Solution {
    public int solution(String s) {
        
        /*
         * https://programmers.co.kr/learn/courses/30/lessons/76502
         */
        
        int answer = 0;
        
        String[] array = s.split("");
        List<String> list = new ArrayList<>();
        list = Arrays.asList(array);
        
        for(int i = 0; i < s.length()-1; i++) {
            Stack<String> stack = new Stack<>();
        
            for(int j = 0; j < list.size(); j++) {
                if(stack.empty()) {
                    stack.push(list.get(j));
                    continue;
                }
                switch(stack.peek()) {
                    case "(" : if(list.get(j).equals(")")) {stack.pop(); break;}
                    case "{" : if(list.get(j).equals("}")) {stack.pop(); break;}
                    case "[" : if(list.get(j).equals("]")) {stack.pop(); break;}
                    default : stack.push(list.get(j)); break;
                }
            }
        
            if(stack.empty()) {
                answer++;
            }
            
            String tmp = list.get(0);
            for(int k = 0; k < list.size(); k++) {
                if(k == list.size()-1) {
                    list.set(k,tmp);
                    break;
                }
                list.set(k,list.get(k+1));
            }
        }
        
        return answer;
    }
}

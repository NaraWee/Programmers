import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        
        /*
         * https://programmers.co.kr/learn/courses/30/lessons/42888
         */
        
        String[][] array = new String[record.length][3];
        Map<String, String> map = new HashMap<>();
        for(int i = 0; i < record.length; i++) {
            String[] strings = record[i].split(" ");
            if(strings.length == 3) {
                map.put(strings[1], strings[2]);
            }
            for(int j = 0; j < strings.length; j++) {
                array[i][j] = strings[j];
            }
        }
        
        List<String> list = new ArrayList<>();
        for(int i = 0; i < array.length; i++) {
            if(array[i][0].equals("Enter")) {
                list.add(map.get(array[i][1]) + "님이 들어왔습니다.");
            } else if(array[i][0].equals("Leave")) {
                list.add( map.get(array[i][1]) + "님이 나갔습니다.");
            }
        }
        
        return list.toArray(new String[list.size()]);
    }
}

import java.util.*;

class Tuple {
    public int[] solution(String s) {   
        
        /*
         * https://programmers.co.kr/learn/courses/30/lessons/64065
         */
        
        String tmp = s.substring(1,s.length()-1);
        String[] nums = tmp.split("},");
        
        for(int i = 0; i < nums.length; i++) {
            if(i < nums.length-1) {
                nums[i] = nums[i].substring(1,nums[i].length());
            } else {
                nums[i] = nums[i].substring(1,nums[i].length()-1);
            }
        }
        
        Arrays.sort(nums, Comparator.comparing(String::length));
        int[] answer = new int[nums.length];
        answer[0] = Integer.parseInt(nums[0]);
        
        for(int i = 1; i < nums.length; i++) {
            String[] value = nums[i].split(",");
            
            for(String test : value) {
                boolean flag = true;
                for(int test2 : answer) {
                    if(Integer.parseInt(test) == test2) {
                        flag = false;
                    }
                }
                if(flag) {
                    answer[i] = Integer.parseInt(test);
                    break;
                }
            }
            
        }

        return answer;
    }
}

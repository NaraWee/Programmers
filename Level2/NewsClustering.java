import java.util.*;
import java.lang.*;

class NewsClustering {
    public int solution(String str1, String str2) {
        
        /*
         * https://programmers.co.kr/learn/courses/30/lessons/17677
         */
        
        int answer = 0;
        
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        
        for(int i = 0; i < str1.length()-1; i++) {
            if(((str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z') || (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z')) && ((str1.charAt(i+1) >= 'a' && str1.charAt(i+1) <= 'z') || (str1.charAt(i+1) >= 'A' && str1.charAt(i+1) <= 'Z'))) {
                list1.add(str1.substring(i,i+2).toLowerCase());
            }
        }
        
        for(int i = 0; i < str2.length()-1; i++) {
            if(((str2.charAt(i) >= 'a' && str2.charAt(i) <= 'z') || (str2.charAt(i) >= 'A' && str2.charAt(i) <= 'Z')) && ((str2.charAt(i+1) >= 'a' && str2.charAt(i+1) <= 'z') || (str2.charAt(i+1) >= 'A' && str2.charAt(i+1) <= 'Z'))) {
                list2.add(str2.substring(i,i+2).toLowerCase());
            }
        }
        
        List<String> union = getUnionList(list1, list2);
        List<String> intersect = getIntersectList(list1, list2);
        
        if(intersect.size() == union.size()) {
            return 65536;
        }
        
        double result = (double)intersect.size()/union.size()*65536;
        answer = (int)Math.floor(result);
        
        return answer;
    }
    
    
    
    public List<String> getUnionList(List<String> slist1, List<String> slist2) {
        List<String> list1 = new ArrayList<>(slist1);
        List<String> list2 = new ArrayList<>(slist2);
        List<String> union = new ArrayList<>();
        
        for(int i = 0; i < list1.size(); i++) {
            if(list2.contains(list1.get(i))) {
                list2.remove(list1.get(i));
            }
            union.add(list1.get(i));
        }
        for(int i = 0; i < list2.size(); i++) {
            union.add(list2.get(i));
        }
        
        return union;
    }
    
    
    
    public List<String> getIntersectList(List<String> slist1, List<String> slist2) {
        List<String> list1 = new ArrayList<>(slist1);
        List<String> list2 = new ArrayList<>(slist2);
        List<String> intersect = new ArrayList<>();
        
        for(int i = 0; i < list1.size(); i++) {
            if(list2.contains(list1.get(i))) {
                intersect.add(list1.get(i));
                list2.remove(list1.get(i));
            }
        }
        
        return intersect;
    }
}

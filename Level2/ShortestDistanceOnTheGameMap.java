import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int[][] maps) {
        
        /*
         * https://school.programmers.co.kr/learn/courses/30/lessons/1844
         */
        
        int answer = 1;
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {0,0});
        
        int[][] check = new int[maps.length][maps[0].length];
        check[0][0] = 1;
        
        while(!queue.isEmpty()) {
            
            int[] point = queue.poll();
            
            if(point[0]+1 < maps.length && maps[point[0]+1][point[1]] == 1 && check[point[0]+1][point[1]] == 0) {
                check[point[0]+1][point[1]] = check[point[0]][point[1]] + 1;
                queue.add(new int[] {point[0]+1, point[1]});
            }
            if(point[1]+1 < maps[0].length && maps[point[0]][point[1]+1] == 1 && check[point[0]][point[1]+1] == 0) {
                check[point[0]][point[1]+1] = check[point[0]][point[1]] + 1;
                queue.add(new int[] {point[0], point[1]+1});
            }
            if(point[0]-1 >= 0 && maps[point[0]-1][point[1]] == 1 && check[point[0]-1][point[1]] == 0) {
                check[point[0]-1][point[1]] = check[point[0]][point[1]] + 1;
                queue.add(new int[] {point[0]-1, point[1]});
            }
            if(point[1]-1 >= 0 && maps[point[0]][point[1]-1] == 1 && check[point[0]][point[1]-1] == 0) {
                check[point[0]][point[1]-1] = check[point[0]][point[1]] + 1;
                queue.add(new int[] {point[0], point[1]-1});
            }            
        }
        
        if(check[maps.length-1][maps[0].length-1] == 0) {
            return -1;
        }
        
        return check[maps.length-1][maps[0].length-1];
    }
}

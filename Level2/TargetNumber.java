class Solution {
    public int solution(int[] numbers, int target) {
        
        /*
	       * https://school.programmers.co.kr/learn/courses/30/lessons/42587
		     */
        
        int answer = 0;
        
        answer = getSum(numbers, target, 0, 0, answer);
        
        return answer;
    }
    
    public int getSum(int[] numbers, int target, int sum, int index, int answer) {
        
        if(index == numbers.length) {
            if(sum == target) {
                return answer+1;
            }
            return answer;
        }
        
        answer = getSum(numbers, target, sum+numbers[index], index+1, answer);
        answer = getSum(numbers, target, sum-numbers[index], index+1, answer);
        
        return answer;
        
    }
}

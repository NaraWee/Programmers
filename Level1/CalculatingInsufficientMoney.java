class Solution {
    public long solution(int price, int money, int count) {
        
        /*
         * https://programmers.co.kr/learn/courses/30/lessons/82612
         */
        
        long pay = 0;
        for(int i = 1; i <= count; i++) {
            pay += price*i;
        }
        
        if(pay >= money) {
            return pay-money;
        }

        return 0;
    }
}

import java.util.*;

class Solution {
    
    /*
     * https://school.programmers.co.kr/learn/courses/30/lessons/42839
     */
    
    public int solution(String numbers) {
        int answer = 0;

        String[] numberString = numbers.split("");
        boolean[] check = new boolean[numberString.length];
        List<Integer> numberList = new ArrayList<>();
        Set<Integer> numberSet = new HashSet<>();
        numberSet = find(numberString, check, numberList, numberSet);
        for(Integer number : numberSet) {
            if(number != 1 && isPrimeNumber(number)) {
                answer++;
            }
        }

        return answer;
    }

    public Set<Integer> find(String[] numberString, boolean[] check, List<Integer> numberList, Set<Integer> numberSet) {
        int checkCount = 0;
        for(boolean b : check) {
            if(b) checkCount++;
        }

        int number = 0;
        for(int i = 0; i < numberList.size(); i++) {
            number += numberList.get(i) * Math.pow(10,i);
        }
        if(number != 0) {
            numberSet.add(number);
        }

        for(int i = 0; i < numberString.length; i++) {
            if(!check[i]) {
                check[i] = true;
                numberList.add(Integer.valueOf(numberString[i]));
                numberSet = find(numberString, check, numberList, numberSet);
                numberList.remove(numberList.size()-1);
                check[i] = false;
            }
        }

        return numberSet;
    }

    public boolean isPrimeNumber(int number) {
        for(int i = 2; i <= (int)Math.sqrt(number); i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

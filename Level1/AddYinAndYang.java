class AddYinAndYang {
    public int solution(int[] absolutes, boolean[] signs) {

				/*
				 * https://programmers.co.kr/learn/courses/30/lessons/76501
				 */

        int answer = 0;

        for(int i = 0; i < absolutes.length; i++) {
            if(signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }

        return answer;
    }
}
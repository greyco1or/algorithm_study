import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n/2 + 1];
        int j = 0;
        for(int i = 1; i <= n; i++) {
            if(i%2 == 1) {
                answer[j] = i;
                    j++;
            }
        }
        
        if(answer[answer.length-1] == 0) {
            int[] anotherAnswer = new int[answer.length-1];
            for(int i = 0; i < answer.length-1; i++) {
                anotherAnswer[i] = answer[i];
            }
            return anotherAnswer;
        }
        return answer;
    }
}
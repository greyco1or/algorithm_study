import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int cnt = 0;
        if(n%2 == 0) {
            cnt = n/2;
        } else {
            cnt = n/2+1;
        }
        int[] answer = new int[cnt];
        int j = 0;
        for(int i = 1; i <= n; i++) {
            if(i%2 == 1) {
                answer[j] = i;
                    j++;
            }
        }
        
        return answer;
    }
}
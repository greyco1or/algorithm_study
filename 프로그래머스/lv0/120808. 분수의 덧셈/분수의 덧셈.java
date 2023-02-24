class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 1/3, 2/5
        int[] answer = new int[2];
        int[] num = new int[1000];
        int motherInt = 0;
        int sonInt1 = 0;
        int sonInt2 = 0;
        
        motherInt = denom1 * denom2;
        sonInt1 = numer1 * denom2;
        sonInt2 = numer2 * denom1;
        int resultSonInt = sonInt1 + sonInt2;
        
        for(int i = 2; i<1000; i++) {
            while(motherInt % i ==0 && resultSonInt % i == 0) {
                if(motherInt == i) {
                    break;
                }
                 resultSonInt = resultSonInt/i;
                 motherInt = motherInt/i;
            }
        }
        if(motherInt == resultSonInt) {
            motherInt = 1;
            resultSonInt = 1;
        }
        if(resultSonInt % motherInt == 0) {
            resultSonInt = resultSonInt/motherInt;
            motherInt = 1;
        }
        
        answer[0] = resultSonInt;
        answer[1] = motherInt;
        return answer;
    }
}
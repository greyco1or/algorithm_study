import java.util.Arrays;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        // 지갑과 지폐의 크기를 정렬
        Arrays.sort(wallet);
        Arrays.sort(bill);
        
        while (bill[0] > wallet[0] || bill[1] > wallet[1]) {
            if (bill[1] > bill[0]) {
                bill[1] /= 2;
            } else {
                bill[0] /= 2;
            }
            answer++;
            
            // 정렬 유지
            Arrays.sort(bill);
        }
        
        return answer;
    }
}
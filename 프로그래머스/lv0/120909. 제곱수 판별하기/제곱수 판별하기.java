class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 1;
        while(num <= 1000) {
            if(Math.pow(num, 2) == n) {
                return answer = 1;
            }
            num++;
        }
        return answer = 2;
    }
}
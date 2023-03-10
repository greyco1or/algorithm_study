class Solution {
    public int solution(int n) {
        int answer = 0;
        int tmp = 0;
        while(n!=tmp) {
            tmp++;
            if(n%tmp == 0) {
                answer++;
            }
        }
        return answer;
    }
}
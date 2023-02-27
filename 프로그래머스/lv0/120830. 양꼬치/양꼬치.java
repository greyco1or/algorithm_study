class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int meat = 12000;
        int drink = 2000;
        int service = 10;
        if(n >= 10) {
            int check = n/10;
            answer = (12000 * n) + (2000 * (k - check));
        } else {
            answer = (12000 * n) + (2000 * k);
        }
        return answer;
    }
}
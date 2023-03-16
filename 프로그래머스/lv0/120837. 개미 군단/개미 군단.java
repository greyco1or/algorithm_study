class Solution {
    public int solution(int hp) {
        int answer = 0;
        int general = 5;
        int soldier = 3;
        int worker = 1;
        if(hp/5 > 0) {
            answer += hp/5;
            hp = hp%general;
        }
        if(hp/3 > 0) {
            answer += hp/3;
            hp = hp%soldier;
        }
        if(hp/1 > 0) {
            answer += hp/1;
        }
        return answer;
    }
}
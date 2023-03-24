class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] tmpArr = cipher.split("");
        for(int i = 0; i < tmpArr.length+1; i++) {
            if(i%code == 0 && i/code > 0) {
                answer += tmpArr[i-1];
            }
        }
        return answer;
    }
}
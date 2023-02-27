class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++) {
            for(int ii=0; ii < n; ii++) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}
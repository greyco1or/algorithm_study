class Solution {
    public String solution(String my_string) {
        String answer = "";
        int num = my_string.length() -1;
        for(int i=num; i >= 0; i--) {
            answer += String.valueOf(my_string.charAt(i));
        }
        return answer;
    }
}
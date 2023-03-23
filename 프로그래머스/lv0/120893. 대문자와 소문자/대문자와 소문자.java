class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] tmpArr = my_string.toCharArray();
        
        for(char c : tmpArr) {
            if(Character.isUpperCase(c)) {
                answer += Character.toString(c).toLowerCase();
            }else {
                answer += Character.toString(c).toUpperCase();
            }
        }
        
        return answer;
    }
}
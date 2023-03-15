class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] strArr = my_string.split("");
        for(int i = 0; i < my_string.length(); i++) {
            try {
                answer += Integer.parseInt(strArr[i]);
            } catch (NumberFormatException ex) {
                continue;
            }
        }
        return answer;
    }
}
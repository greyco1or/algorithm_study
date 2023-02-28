class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int index = 0;
        for(int i=0; i < strlist.length; i++) {
             answer[index] = strlist[i].length();
             index += 1;
        }
        return answer;
    }
}
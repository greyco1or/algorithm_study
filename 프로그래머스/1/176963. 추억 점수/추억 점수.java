import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for(int i=0; i < photo.length; i++) {
            int score = 0;
            for(String item : photo[i]) {
                int itemIndex = Arrays.asList(name).indexOf(item);
                if(itemIndex != -1) {
                    score += yearning[itemIndex];
                }
            }
            answer[i] = score;
        }
        return answer;
    }
}
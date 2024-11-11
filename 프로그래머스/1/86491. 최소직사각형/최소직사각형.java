import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int firstNum = 0;
        int secondNum = 0;
        for(int[] nameCard : sizes) {
            Arrays.sort(nameCard);
            if(nameCard[1] > firstNum) {
                firstNum = nameCard[1];
            }
            if(nameCard[0] > secondNum) {
                secondNum = nameCard[0];
            }
        }
        return firstNum * secondNum;
    }
}
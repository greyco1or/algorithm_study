import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int longestInt = sides[0];
        int tmpInt = 0;
        for(int i = 1; i<3; i++) {
            if(sides[i] > longestInt) {
                longestInt = sides[i];
            }
        }
        List<Integer> intList = new ArrayList<>();
        for (int e : sides) {
            intList.add(e);
        }
        intList.remove(intList.indexOf(longestInt));
        for(int i : intList) {
            tmpInt += i;
        }
        if(longestInt < tmpInt) {
            answer = 1;
        } else {
            answer = 2;
        }
        
        return answer;
    }
}
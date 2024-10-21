import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int chance = nums.length/2;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.merge(num, 1 , (oldValue, newValue) -> oldValue + newValue);
        }
        answer = map.size();
        if(answer > chance) {
            answer = chance; 
        }
        return answer;
    }
}
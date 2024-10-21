import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int chance = nums.length/2;
        int answer = 0;
        HashSet<Integer> hashSet = new HashSet<>();
        for(int num : nums) {
            hashSet.add(num);
        }
        answer = hashSet.size();
        if(answer > chance) {
            answer = chance; 
        }
        return answer;
    }
}
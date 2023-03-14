import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        HashSet<String> set = new HashSet<String>(List.of(s2));
        for(String i : s1) {
            if(set.contains(i)) {
                answer++;
            }
        }
        
        return answer;
    }
}
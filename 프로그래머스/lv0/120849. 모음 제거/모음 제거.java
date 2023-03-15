import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        String[] filter = {"a", "e", "i", "o", "u"};
        for(String s : filter) {
            if(answer.contains(s)) {
                answer = answer.replace(s, "");
            }
        }
        
        return answer;
    }
}
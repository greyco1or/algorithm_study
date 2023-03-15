import java.util.*;

class Solution {
    public String solution(String my_string) {
        String[] filter = {"a", "e", "i", "o", "u"};
        for(String s : filter) {
            if(my_string.contains(s)) {
                my_string = my_string.replace(s, "");
            }
        }
        
        return my_string;
    }
}
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(String item : participant) {
            if(hashMap.containsKey(item)) {
                int num = hashMap.get(item);
                hashMap.put(item, ++num);
            } else {
                hashMap.put(item, 1);
            }
        }
        for(String person : completion) {
            boolean isCheck = hashMap.containsKey(person);
            if(!isCheck) {
                answer = person;
                break;
            } else {
                int num = hashMap.get(person);
                if(num > 1) {
                    hashMap.put(person, --num);
                } else {
                    hashMap.remove(person);
                }
            }
        }
        System.out.println(hashMap.keySet());
        answer = hashMap.keySet().iterator().next();
        return answer;
    }
}
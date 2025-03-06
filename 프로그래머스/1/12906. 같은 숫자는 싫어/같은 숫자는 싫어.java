import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        for(int num : arr) {
            if(stack.isEmpty()) {
                stack.push(num);
            }
            if(stack.peek() != num) {
                stack.push(num);
            }
        }
        int[] answer = new int[stack.size()];     
        for (int i = 0; i < answer.length; i++) {
            answer[i] = stack.get(i);
        }
        return answer;
    }
}
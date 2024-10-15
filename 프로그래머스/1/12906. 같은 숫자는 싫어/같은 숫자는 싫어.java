import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int num : arr) {
            if(stack.isEmpty()) {
                stack.push(num);
                arrayList.add(num);
            } else {
                int tmp = stack.peek();
                if(num != tmp) {
                    stack.push(num);
                    arrayList.add(num);
                }
            }
        }
        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}
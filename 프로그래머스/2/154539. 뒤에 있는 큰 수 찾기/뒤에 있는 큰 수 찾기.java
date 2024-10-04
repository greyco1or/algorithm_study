import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1);
        //큰 수를 저장해두는 용도
        Stack<Integer> stack = new Stack<>();
        
        for(int i = numbers.length-1; i >= 0; i--) {
            
            //현재 수가 스택보다 더 크면 계속 pop
            while (!stack.isEmpty() && stack.peek() <= numbers[i]) {
                stack.pop();
            }
            
            //가장 가까운 큰 수를 할당
            if(!stack.empty()) {
                answer[i] = stack.peek();
            }
            
            //무조건 push하니까 가장 가까운 수 찾을 수 있음
            stack.push(numbers[i]);
        }
        return answer;
    }
}
import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> answerList = new ArrayList<>();
        
       for (int i = 0; i < progresses.length; i++) {
            int daysLeft = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            queue.offer(daysLeft);
        }
        
        while (!queue.isEmpty()) {
            int day = queue.poll();
            int count = 1;
            
            while (!queue.isEmpty() && queue.peek() <= day) {
                queue.poll();
                count++;
            }
            answerList.add(count);
        }
        
        return answerList.stream().mapToInt(i -> i).toArray();
    }
}